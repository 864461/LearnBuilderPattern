package org.example;
//Fluent builder pattern, difference between fluent builder and normal builder each setter method return the builder which allow for successive calls


public class HouseBuilder {
    private int floors;
    private int bedrooms;
    private int bathrooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    public HouseBuilder setFloors(int floors) {
        this.floors = floors;
        return this;
    }

    public HouseBuilder setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
        return this;
    }

    public HouseBuilder setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
        return this;
    }

    public HouseBuilder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }

    public House build() {
        return new House(floors, bedrooms, bathrooms, hasGarage, hasSwimmingPool);
    }
}
