package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Employee{
    private String name;
    private String email;
    private int age;
    private double salary;
    public Employee(String name, String email, int age, double salary){
        this.name=name;
        this.email=email;
        this.age=age;
        this.salary=salary;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String employee_info(){
        return "Name of employee: "+name+", Email of employee:"+email+", Age of employee:"+age+", Salary of employee: "+salary;
    }
}
class Intern extends Employee{
  public static final double Max_Salary = 20000;
  public Intern(String name, String email, int age, double salary){
      super(name,email,age,salary>Max_Salary ? Max_Salary:salary);
      if(salary>Max_Salary){
          System.out.println("Warning! The salary entered for intern "+salary+" has been sent to "+Max_Salary+" because it exceeds to limit");

      }
  }
    public void setSalary(double salary){
        if(salary<=Max_Salary){
            super.setSalary(salary);
        }
        else {
            super.setSalary(Max_Salary);
        }
    }
}
public class Main{
    public static void main(String[] args){
        List<Employee> interns = new ArrayList<>();
        String[] names= {"Shabnam", "Ali", "Leyla", "Murad", "Aysel", "Vusal", "Deniz", "Rauf", "Fidan", "Tural"};;
        for(int i=0; i<10;i++){
            interns.add(new Intern(names[i], names[i].toLowerCase() + "@mail.com", 20 + i, 1500 + (i * 100)));
        }
       try {
           FileWriter file = new FileWriter("employees.txt");
           for (Employee it : interns) {
               file.write(it.employee_info()+"\n");
           }
           file.close();
       }
        catch (Exception e) {
           System.err.println("It is problem for this");
       }


    }
}



