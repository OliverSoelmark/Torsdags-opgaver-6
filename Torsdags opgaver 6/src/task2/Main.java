package task2;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Cafe objekt
        Cafe cafe = new Cafe();

        //loader kaffe menuen fra filen
        cafe.loadMenuData();

        //Henter listen via getter
        ArrayList<String> menu = cafe.getCoffeeMenu();

        //print alle kaffetyper
        System.out.println("Kaffemenu: ");
        for (String coffee : menu)
            System.out.println(coffee);

    }
}
