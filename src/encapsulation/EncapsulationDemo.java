package encapsulation;

import methods_and_constructors.ConstructorDemoTwo;

/*
 * 	encapsulation means hiding properties of a class from the outside world by making them as private
 *  binding data and the operations on the data together is also encapsulation
 */
public class EncapsulationDemo {

    // Employee
    private int id;
    private String name;
    private String designation;
    private double salary;
    private String address;
    private String panNum;
    private boolean isPanAdded = false;

    public EncapsulationDemo(int id, String name, String designation, double salary, String address, String panNum) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
        this.panNum = panNum;
        if(!panNum.equals("")) {
            this.isPanAdded = true;
        }

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getPanNum() {
        return panNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPanNum(String panNum) {
        if(isPanAdded) {
            System.out.println("PAN already added");
        } else {
            this.panNum = panNum;
            isPanAdded = true;
        }
    }

    public void printInfo() {
        System.out.println("*****************************************");
        System.out.printf("id = %d\nname = %s\ndesignation = %s\nsalary = %f\naddress = %s\npan number = %s\n", id, name, designation, salary, address, panNum);
    }




}
