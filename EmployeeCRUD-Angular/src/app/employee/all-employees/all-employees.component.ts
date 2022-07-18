import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeCrudService } from '../employee-crud.service';

@Component({
  selector: 'app-all-employees',
  templateUrl: './all-employees.component.html',
  styleUrls: ['./all-employees.component.css']
})
export class AllEmployeesComponent implements OnInit {

  allEmployees: Employee[] = [];
  result: boolean = false;
  constructor(private employeeService: EmployeeCrudService , private router: Router) { }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.employeeService.getAllEmployees().subscribe(data => {
      this.allEmployees = data;
      console.log(data);
    });
  }

  deleteEmployee(employeeId: number){
    console.log("deleteEmployee() called");
    console.log("delete employeeId : " + employeeId);
    this.employeeService.deleteEmployee(employeeId).subscribe(data => {
      this.result = data;
      if(this.result == true)
        this.reloadData();
    });
  }

  updateEmployee(employeeId: number){
    console.log("updateEmployee() called");
    console.log("update employeeId : " + employeeId);
    this.router.navigate(['updateemployee',employeeId]);
  }

  employeeDetails(employeeId: number){
    console.log("employeeDetails() called");
    console.log(" employeeId : " + employeeId);
    this.router.navigate(['employeedetails',employeeId]);
  }

}
