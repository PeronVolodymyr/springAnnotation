package model;

/**
 * Created by george on 3/15/18.
 */
public class Bill {
    int id;
    String name;
    Cham cham;
    Food food;

    public Bill(int id, String name, Cham cham, Food food) {
        this.id = id;
        this.name = name;
        this.cham = cham;
        this.food = food;
    }

    public Bill() {
    }

    @Override
    public String toString() {
        return "\nBill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cham=" + cham +
                ", food=" + food +
                '}';
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

    public Cham getCham() {
        return cham;
    }

    public void setCham(Cham cham) {
        this.cham = cham;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
