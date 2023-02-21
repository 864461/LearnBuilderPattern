package org.example;
//
//Example of a fluent builder pattern


public class Main {


    public static void main(String[] args) {

        //normal fluent builder implementation
        HouseBuilder builder = new HouseBuilder();
        House house = builder.setFloors(2)
                .setBedrooms(3)
                .setBathrooms(2)
                .setHasGarage(true)
                .setHasSwimmingPool(false)
                .build();


        //implementing a fluent builder with recursive generics to solve problem with inheritance from other builders
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        Worker worker = employeeBuilder
                .setFirstName("Alvin")
                .setLastName("testing")
                .setSalary(100000)
                .setPosition("juniorDeveloper")
                .setAge(25).build();


        System.out.println("HouseBuilderTest : " + house.toString());
        System.out.println("HouseBuilderTest : " + worker.toString());
    }
}