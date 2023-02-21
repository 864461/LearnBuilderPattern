package org.example;

public class House {
    private int floors;
    private int bedrooms;
    private int bathrooms;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    public House(int floors, int bedrooms, int bathrooms, boolean hasGarage, boolean hasSwimmingPool) {
        this.floors = floors;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }


    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", bedrooms=" + bedrooms +
                ", bathrooms=" + bathrooms +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }
}
