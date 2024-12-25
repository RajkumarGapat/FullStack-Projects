import { Component, OnInit } from '@angular/core';
import { WeatherService } from '../weather.service';

@Component({
  selector: 'app-weather',
  templateUrl: './weather.component.html',
  styleUrls: ['./weather.component.css'],
  
})
export class WeatherComponent implements OnInit {
  weatherData: any = null;

  constructor(private weatherService: WeatherService) {}

  ngOnInit() {
    this.weatherService.getWeather('New York').subscribe((data) => {
      this.weatherData = data;
    });
  }
}
