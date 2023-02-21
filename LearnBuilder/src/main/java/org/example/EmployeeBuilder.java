package org.example;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder>{
    //Extending personBuilder and passing in employee builder which extends personbuilder

    protected String position;
    protected int salary;


    public EmployeeBuilder setPosition(String position){
        worker.position = position;
        return self();
    }

    public EmployeeBuilder setSalary(int salary){
        worker.salary = salary;
        return self();
    }

    @Override
    public EmployeeBuilder self() {
        return this;
    }
}
