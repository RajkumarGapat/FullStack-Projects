package service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeoCodingService {

    private final String apiKey = "your_geocoding_api_key";

    public String reverseGeocode(String lat, String lon) {
        String url = String.format(
            "https://api.opencagedata.com/geocode/v1/json?q=%s,%s&key=%s",
            lat, lon, apiKey
        );
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}