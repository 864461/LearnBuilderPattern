package org.example;

public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
// recursive generics, self is an object which must extend PersonBuilder
    protected String firstName;
    protected  String lastName;
    protected  int age;

    protected  Worker worker = new Worker();
    public  SELF setFirstName(String firstName){
        worker.firstName= firstName;
        return self();
    }


    public  SELF setLastName(String lastName){
        worker.lastName = lastName;
        return self();
    }

    public  SELF setAge(int age){
        worker.age= age;
        return self();
    }

    public Worker build(){
        return worker;
    }
// creating a method that cast self  to the current  personbuilder object which will later be overriden to return anything that extend person builder
    public SELF self(){
        return (SELF) this;
    }


}
