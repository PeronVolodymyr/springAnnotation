package model;

/**
 * Created by george on 3/1/18.
 */
public class Cham {
    private int id;
    private String  name;
    private boolean bar;
    private int price;

    public Cham() {
    }

    public Cham(int id, String name, boolean bar) {
        this.id = id;
        this.name = name;
        this.bar = bar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public boolean isBar() {
        return bar;
    }

    public void setBar(boolean bar) {
        this.bar = bar;
    }


    public void ShowInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Cham{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bar=" + bar +
                '}';
    }
}
