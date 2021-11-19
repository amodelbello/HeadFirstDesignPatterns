package com.adb.factory.IngredientFactory;

import com.adb.factory.Ingredient.*;
import com.adb.factory.Ingredient.Cheese.MozzarellaCheese;
import com.adb.factory.Ingredient.Cheese.ReggianoCheese;
import com.adb.factory.Ingredient.Clam.FrozenClam;
import com.adb.factory.Ingredient.Dough.ThickCrustDough;
import com.adb.factory.Ingredient.Dough.ThinCrustDough;
import com.adb.factory.Ingredient.Pepperoni.SlicedPepperoni;
import com.adb.factory.Ingredient.Sauce.MarinaraSauce;
import com.adb.factory.Ingredient.Sauce.PlumTomatoSauce;
import com.adb.factory.Ingredient.Veggie.*;
import com.adb.factory.IPizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements IPizzaIngredientFactory {
  @Override
  public IDough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public ISauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public ICheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public IVeggie[] createVeggies() {
    return new IVeggie[] {new Eggplant(), new Onion(), new Mushroom(), new RedPepper()};
  }

  @Override
  public IPepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public IClam createClam() {
    return new FrozenClam();
  }
}
