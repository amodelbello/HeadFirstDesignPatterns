package com.adb.factory.Store;

import com.adb.factory.APizza;
import com.adb.factory.IPizzaIngredientFactory;
import com.adb.factory.IngredientFactory.NYPizzaIngredientFactory;
import com.adb.factory.Pizza.*;
import com.adb.factory.PizzaStore;
import com.adb.factory.PizzaType;

public class NYPizzaStore extends PizzaStore {
  @Override
  public APizza createPizza(PizzaType type) {
    APizza pizza = null;
    IPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    switch (type) {
      case CHEESE:
        pizza = new CheesePizza(ingredientFactory);
        break;
      case PEPPERONI:
        pizza = new PepperoniPizza(ingredientFactory);
        break;
      case CLAM:
        pizza = new ClamPizza(ingredientFactory);
        break;
      case VEGGIE:
        pizza = new VeggiePizza(ingredientFactory);
        break;
    }

    return pizza;
  }
}
