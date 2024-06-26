package decorator;

import base.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    public int cost() {
        return basePizza.cost() + 15;
    }
}
