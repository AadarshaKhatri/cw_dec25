package models;
import java.util.List;

public class Shop {
    String name;
     int id;



    int price;

    public Shop(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public static void displayOrderTotal(List<Shop> itemList) {
        double total = 0;
        for (Shop item : itemList) {
            total += item.getPrice();
        }
        System.out.println("Order Total: Rs" + total);
    }
}
