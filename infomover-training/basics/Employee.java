package com.imt.training.java.basics;

public class Employee {
    private int id;
    private String name;
    private  String address;

    public Employee(){}
    public Employee(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public void printEmployeeDetails(){
        System.out.println("id: "+this.id+" name: "+this.name+" address: "+this.address);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String  toString(){
//        return "abadabaadoo";
        return this.id+" -- "+this.name+" -- "+this.address;
    }
    public boolean equals(Employee obj){
        return this.id == obj.id;
    }



}
