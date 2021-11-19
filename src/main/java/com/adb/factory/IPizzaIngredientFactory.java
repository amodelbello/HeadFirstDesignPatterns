package com.adb.factory;

import com.adb.factory.Ingredient.*;

public interface IPizzaIngredientFactory {
  public IDough createDough();

  public ISauce createSauce();

  public ICheese createCheese();

  public IVeggie[] createVeggies();

  public IPepperoni createPepperoni();

  public IClam createClam();
}
