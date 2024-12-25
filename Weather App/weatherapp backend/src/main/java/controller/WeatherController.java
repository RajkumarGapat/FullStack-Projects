package controller;

import model.SavedLocation;
import repository.LocationRepository;
import service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping("/weather")
    public ResponseEntity<String> getWeather(@RequestParam String lat, @RequestParam String lon) {
        return ResponseEntity.ok(weatherService.getWeather(lat, lon));
    }

    @PostMapping("/locations")
    public ResponseEntity<SavedLocation> saveLocation(@RequestBody SavedLocation location) {
        return ResponseEntity.ok(locationRepository.save(location));
    }

    @GetMapping("/locations")
    public ResponseEntity<List<SavedLocation>> getLocations() {
        return ResponseEntity.ok(locationRepository.findAll());
    }
}