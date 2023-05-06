## Problem Statement:

You are tasked with building a simple payroll system for a company. The system should be able to handle employees of different types (e.g., hourly, salaried, commission-based), and should be able to calculate their pay based on their type and hours worked. The system should also be able to calculate and display the total payroll for the company.

### Requirements:

1. Create a class called `Employee` which should have the following attributes:
   - `name` (String)
   - `id` (int)
   - `payRate` (double)
   
   Also, `Employee` should have the following methods:
   - `calculatePay(hoursWorked: int): double` which should return the pay for the employee based on their pay rate and hours worked.
   - `display(): void` which should display the name, id, pay rate, and any other information relevant to the employee type.

2. Create three classes that inherit from `Employee`: `HourlyEmployee`, `SalariedEmployee`, and `CommissionEmployee`. Each of these classes should have their own unique attributes and methods. For example:
   - `HourlyEmployee` should have an additional attribute called `hourlyRate` (double), and a method called `calculatePay` that calculates pay based on the number of hours worked and the hourly rate.
   - `SalariedEmployee` should have an additional attribute called `salary` (double), and a method called `calculatePay` that returns the employee's salary.
   - `CommissionEmployee` should have additional attributes called `commissionRate` (double) and `sales` (double), and a method called `calculatePay` that calculates the employee's pay based on their sales and commission rate.

3. Create a `PayrollSystem` class that can handle a list of employees, calculate the total payroll for the company, and display information about each employee. This class should have the following methods:
   - `addEmployee(employee: Employee): void` which adds an employee to the list of employees.
   - `removeEmployee(employee: Employee): void` which removes an employee from the list of employees.
   - `calculatePayroll(): double` which calculates the total payroll for the company based on the hours worked and pay rate of each employee.
   - `displayEmployees(): void` which displays information about each employee in the list.

### Constraints:

- The program should allow the user to add and remove employees, and calculate the total payroll for the company.
- The program should be able to handle employees of different types, and calculate their pay based on their pay rate and hours worked (or salary and/or sales and commission rate).
- The program should demonstrate inheritance, polymorphism, abstraction, and encapsulation.

### Example:

```java
PayrollSystem payrollSystem = new PayrollSystem();

// Add an hourly employee
HourlyEmployee hourlyEmployee = new HourlyEmployee("John Smith", 12345, 15.0, 20.0);
payrollSystem.addEmployee(hourlyEmployee);

// Add a salaried employee
SalariedEmployee salariedEmployee = new SalariedEmployee("Jane Doe", 67890, 50000.0);
payrollSystem.addEmployee(salariedEmployee);

// Add a commission employee
CommissionEmployee commissionEmployee = new CommissionEmployee("Bob Johnson", 13579, 0.1, 5000.0);
payrollSystem.addEmployee(commissionEmployee);

// Calculate and display payroll
double totalPayroll = payrollSystem.calculatePayroll();
System.out.println("Total payroll: " + totalPayroll);
```