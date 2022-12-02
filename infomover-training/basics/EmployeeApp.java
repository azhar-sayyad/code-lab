package com.imt.training.java.basics;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setId(101);
        emp1.setName("Azhar");
        emp1.setAddress("Buldhana");
        emp1.printEmployeeDetails();

        Employee emp2 = new Employee();

        emp2.setId(102);
        emp2.setName("Arbaz");
        emp2.setAddress("Hyderabad");
        emp2.printEmployeeDetails();

	Employee emp3 = new Employee();

        emp3.setId(103);
        emp3.setName("Shahrukh");
        emp3.setAddress("Chikhli");
        emp3.printEmployeeDetails();

        Employee emp4 = new Employee(104,"Mohsin","Pune");

        emp4.printEmployeeDetails();

        System.out.println(emp4);
        System.out.println(emp3);
        System.out.println(emp2);
        System.out.println(emp1);
        Employee emp5 = new Employee(101,"Harish","Pune");

        System.out.println(emp1.equals(emp4));

        if(emp1.equals(emp4)){
            throw new RuntimeException("Two employee cannot have same id");
        }
        else{
            System.out.println("validation Succeeded");
        }

    }
}
