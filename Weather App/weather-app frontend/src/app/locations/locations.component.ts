import { Component } from '@angular/core';


@Component({
  selector: 'app-locations',
  templateUrl: './locations.component.html',
  styleUrls: ['./locations.component.css'],
})
export class LocationsComponent {
  locations = [
    { label: 'Home', latitude: '40.7128', longitude: '-74.0060' },
  ];
  newLocation = { label: '', latitude: '', longitude: '' };

  saveLocation() {
    if (
      this.newLocation.label &&
      this.newLocation.latitude &&
      this.newLocation.longitude
    ) {
      this.locations.push({ ...this.newLocation });
      this.newLocation = { label: '', latitude: '', longitude: '' };
    }
  }
}
