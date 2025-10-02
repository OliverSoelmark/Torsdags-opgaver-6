package task3;

import java.util.ArrayList;

public class Building {
   private ArrayList<Room> rooms;
    private int numberOfFloors;
//3.e konstructor der populerer alle felter
    public Building(ArrayList<Room> rooms, int numberOfFloors) {
        this.rooms = new ArrayList<>(rooms);
        this.numberOfFloors = numberOfFloors;
    }
//3.f Getters og Setters
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
