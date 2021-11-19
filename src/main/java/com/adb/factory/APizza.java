package com.adb.factory;

import com.adb.factory.Ingredient.*;

import java.util.ArrayList;
import java.util.List;

public abstract class APizza {
  String name;
  IDough dough;
  ISauce sauce;
  IVeggie[] veggies;
  ICheese cheese;
  IPepperoni pepperoni;
  IClam clam;

  protected abstract void prepare();

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IDough getDough() {
    return dough;
  }

  public void setDough(IDough dough) {
    this.dough = dough;
  }

  public ISauce getSauce() {
    return sauce;
  }

  public void setSauce(ISauce sauce) {
    this.sauce = sauce;
  }

  public IVeggie[] getVeggies() {
    return veggies;
  }

  public void setVeggies(IVeggie[] veggies) {
    this.veggies = veggies;
  }

  public ICheese getCheese() {
    return cheese;
  }

  public void setCheese(ICheese cheese) {
    this.cheese = cheese;
  }

  public IPepperoni getPepperoni() {
    return pepperoni;
  }

  public void setPepperoni(IPepperoni pepperoni) {
    this.pepperoni = pepperoni;
  }

  public IClam getClam() {
    return clam;
  }

  public void setClam(IClam clam) {
    this.clam = clam;
  }

  public String toString() {
    // code to print pizza
    return "";
  }
}
