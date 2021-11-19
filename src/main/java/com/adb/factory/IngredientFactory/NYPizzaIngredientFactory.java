package com.adb.factory.IngredientFactory;

import com.adb.factory.Ingredient.*;
import com.adb.factory.Ingredient.Cheese.ReggianoCheese;
import com.adb.factory.Ingredient.Clam.FreshClam;
import com.adb.factory.Ingredient.Dough.ThinCrustDough;
import com.adb.factory.Ingredient.Pepperoni.SlicedPepperoni;
import com.adb.factory.Ingredient.Sauce.MarinaraSauce;
import com.adb.factory.Ingredient.Veggie.Garlic;
import com.adb.factory.Ingredient.Veggie.Mushroom;
import com.adb.factory.Ingredient.Veggie.Onion;
import com.adb.factory.Ingredient.Veggie.RedPepper;
import com.adb.factory.IPizzaIngredientFactory;

public class NYPizzaIngredientFactory implements IPizzaIngredientFactory {
  @Override
  public IDough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public ISauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public ICheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public IVeggie[] createVeggies() {
    return new IVeggie[] {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
  }

  @Override
  public IPepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public IClam createClam() {
    return new FreshClam();
  }
}
