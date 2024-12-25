package service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final String apiKey = "your_weather_api_key";

    public String getWeather(String lat, String lon) {
        String url = String.format(
            "https://api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&appid=%s",
            lat, lon, apiKey
        );
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}