import base.BasePizza;
import base.Farmhouse;
import decorator.ExtraCheese;
import decorator.Paneer;

public class Driver {

    public static void main(String[] args) {

        BasePizza basePizza = new Paneer(new ExtraCheese(new Farmhouse()));
        System.out.println(basePizza.cost());
    }
}
