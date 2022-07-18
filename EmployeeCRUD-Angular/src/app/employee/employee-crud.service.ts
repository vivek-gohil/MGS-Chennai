import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeCrudService {

  private baseURL: string = "http://localhost:8080/employeeapi/employees";


  constructor(private http: HttpClient) { }

  getAllEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.baseURL + "/all");
  }

  addNewEmployee(employee: Employee): Observable<boolean> {
    return this.http.post<boolean>(this.baseURL + "/employee", employee);
  }

  deleteEmployee(employeeId: number): Observable<boolean> {
    return this.http.delete<boolean>(this.baseURL + "/" + employeeId);
  }

  getEmployeeDetails(employeeId: number): Observable<Employee> {
    return this.http.get<Employee>(this.baseURL + "/" + employeeId);
  }

  updateEmployee(employee: Employee): Observable<boolean> {
    return this.http.put<boolean>(this.baseURL+"/employee" , employee);
  }

}
