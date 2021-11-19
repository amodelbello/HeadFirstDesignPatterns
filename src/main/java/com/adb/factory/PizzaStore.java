package com.adb.factory;

public abstract class PizzaStore {
  public abstract APizza createPizza(PizzaType type);

  public APizza orderPizza(PizzaType type) {
    APizza pizza;

    pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }
}
