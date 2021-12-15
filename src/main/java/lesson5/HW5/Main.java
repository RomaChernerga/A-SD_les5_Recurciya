package lesson5.HW5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Binoculars", 2, 4000));
        items.add(new Item("Cauldron", 1, 500));
        items.add(new Item("First kid", 4, 1000));
        items.add(new Item("Book", 1, 700));
        items.add(new Item("Notebook", 6, 20000));

        Backpack backpack = new Backpack(6);
        backpack.makeAllSets(items);
        System.out.println(items);
        System.out.println("-----------------------");
        System.out.println(backpack.getBestItems());
    }
}
