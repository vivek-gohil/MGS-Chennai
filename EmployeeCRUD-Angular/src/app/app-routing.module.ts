import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddNewEmployeeComponent } from './employee/add-new-employee/add-new-employee.component';
import { AllEmployeesComponent } from './employee/all-employees/all-employees.component';
import { EmployeeDetailsComponent } from './employee/employee-details/employee-details.component';
import { UpdateEmployeeComponent } from './employee/update-employee/update-employee.component';

const routes: Routes = [
  { path: '', redirectTo: 'getallemployees', pathMatch: 'full' },
  { path: 'getallemployees', component: AllEmployeesComponent },
  { path: 'addnewemployee', component: AddNewEmployeeComponent },
  { path: 'employeedetails/:employeeId', component: EmployeeDetailsComponent },
  { path: 'updateemployee/:employeeId', component: UpdateEmployeeComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
