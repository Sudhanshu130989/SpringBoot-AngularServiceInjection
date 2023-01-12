import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class HospitalService {

  constructor(private http:HttpClient) { }

  getHospitalDetails()
  {
    return this.http.get("http://localhost:8080/hospital/details");
  }
}
