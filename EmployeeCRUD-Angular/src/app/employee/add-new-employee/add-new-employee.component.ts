import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeCrudService } from '../employee-crud.service';

@Component({
  selector: 'app-add-new-employee',
  templateUrl: './add-new-employee.component.html',
  styleUrls: ['./add-new-employee.component.css']
})
export class AddNewEmployeeComponent implements OnInit {

  employee: Employee = new Employee();
  result: boolean = false;
  submitted: boolean = false;

  constructor(private employeeService: EmployeeCrudService , 
      private router: Router) { }

  ngOnInit(): void {
  }

  onAddEmployee(){
    console.log(this.employee);
    this.employeeService.addNewEmployee(this.employee).subscribe(data => {
      this.result = data;
      console.log(data);
      this.submitted = true;
    });
  }

  goToHome(){
    console.log("in goToHome()");
    this.router.navigate(['getallemployees']);
  }
}
