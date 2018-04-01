package model;

import org.springframework.stereotype.Component;

/**
 * Created by george on 3/15/18.
 */
public class Food {
    int id;
    String name;
    int price;

    public Food(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Food() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
