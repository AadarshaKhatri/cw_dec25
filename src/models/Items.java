package models;

import java.util.ArrayList;
import java.util.List;

public class Items {
    public static void main(String[] args) {
        Shop item1 = new Shop("Item 1", 1, 100);
        Shop item2 = new Shop("Item 2", 2, 200);
        Shop item3 = new Shop("Item 3", 3, 150);

        List<Shop> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        Shop.displayOrderTotal(itemList);
    }
}
