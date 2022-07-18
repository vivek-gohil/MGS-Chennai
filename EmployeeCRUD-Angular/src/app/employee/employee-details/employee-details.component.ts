import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeCrudService } from '../employee-crud.service';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

  employeeId: number = 0;
  employee: Employee = new Employee();

  constructor(private route: ActivatedRoute, private employeeService: EmployeeCrudService, private router: Router) { }

  ngOnInit(): void {
    this.employeeId = this.route.snapshot.params['employeeId'];
    console.log("In EmployeeDetails");
    console.log(this.employeeId);
    this.getEmployee();
  }

  getEmployee() {
    this.employeeService.getEmployeeDetails(this.employeeId).subscribe(
      data => {
        this.employee = data;
        console.log(this.employee);
      }
    );
  }

  goToHome() {
    console.log("in goToHome()");
    this.router.navigate(['getallemployees']);
  }
}
