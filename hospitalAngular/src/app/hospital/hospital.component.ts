import { Component,OnInit } from '@angular/core';
import { HospitalService } from '../hospital.service';
import{HttpClient}  from  '@angular/common/http';
 
@Component({
  selector: 'app-hospital',
  templateUrl: './hospital.component.html',
  styleUrls: ['./hospital.component.css']
})
export class HospitalComponent implements OnInit {
   hospitalDetails:any
   constructor(private service:HospitalService)
   {

   }
  ngOnInit(): void {
    this.hospitalDetails=this.service.getHospitalDetails().subscribe((data)=>this.hospitalDetails=data);
  }
   

}
