package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int capacity;
    private List<Passenger> passengersList = new ArrayList<>();

    public Plane(int capacity) {
        this.capacity = capacity;
    }

    public boolean addPassenger(Passenger passenger){
        if (capacity - passengersList.size() > 0){
                passengersList.add(passenger);
                return true;
        } else {
            return false;
        }
    }

    public int numberOfPackages() {
        int numberOfPackages = 0;
        for (Passenger p: passengersList){
            numberOfPackages += p.getPackages();
        }
        return numberOfPackages;
    }

    public static void main(String[] args) {
        Passenger passenger = new Passenger("Bob", "HG54", 2);
        Plane plane = new Plane(30);

        plane.addPassenger(passenger);
        System.out.println(plane.numberOfPackages());
    }

}
