/**
 * Created by Billy Yuan on 2017/4/21.
 * Email: billy112487983@gmail.com
 */
public class ToyCar implements Toy, Movable {
    double price;
    String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("ToyCar: Start moving car.");
    }

    @Override
    public String toString() {
        return "ToyCar: Movable Toy car - Price: " + price + " Color: " + color;
    }
}
