/**
 * Created by vindhya on 4/25/16.
 */

import java.lang.*;

class Employee {

    String Name;
    int Age;
    int Salary;

    void Employee(String name)
    {this.Name= name;}
    void Employeeage(int Age)
    {this.Age=Age;}
    void Employeesal(int sal)
    {this.Salary=sal;
    }
    void Employeeprint()
    {
        System.out.println("Name"+Name);
        System.out.println("Age"+Age);
        System.out.println("Salary"+Salary);
    }
}
