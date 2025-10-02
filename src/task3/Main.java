package task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
// 3.g - mindst 3 forskellige rum
        Room r1 = new Room(2,1);
        Room r2 = new Room(4,2);
        Room r3 = new Room(1,3);
//3.h - Samling (Samme datatype som i building = ArrayList <Room>)
        ArrayList<Room> myRooms = new ArrayList<>();
        myRooms.add(r1);
        myRooms.add(r2);
        myRooms.add(r3);

        //3.i - bygning med rummende
        Building b1 = new Building(myRooms,2);




    }
}
