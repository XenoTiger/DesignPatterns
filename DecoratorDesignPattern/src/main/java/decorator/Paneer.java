package decorator;

import base.BasePizza;

public class Paneer extends ToppingDecorator{

    private BasePizza basePizza;

    public Paneer(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    public int cost() {
        return basePizza.cost() + 20;
    }
}
