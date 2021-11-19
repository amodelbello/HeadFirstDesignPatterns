package com.adb.factory.Pizza;

import com.adb.factory.APizza;
import com.adb.factory.IPizzaIngredientFactory;

public class CheesePizza extends APizza {
  IPizzaIngredientFactory ingredientFactory;

  public CheesePizza(IPizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  protected void prepare() {
    System.out.println("Preparing " + getName());
    setDough(ingredientFactory.createDough());
    setSauce(ingredientFactory.createSauce());
    setCheese(ingredientFactory.createCheese());
  }
}
