package com.effective.chapter._2.hierarchicalbuilder.java;


import static _2.hierarchicalbuilder.java.NyPizza.Size.SMALL;
import static _2.hierarchicalbuilder.java.Pizza.Topping.HAM;
import static _2.hierarchicalbuilder.java.Pizza.Topping.ONION;
import static _2.hierarchicalbuilder.java.Pizza.Topping.SAUSAGE;


// 계층적 빌더 사용 (21쪽)
public class PizzaTest {

  public static void main(String[] args) {
    NyPizza pizza = new NyPizza.Builder(SMALL)
        .addTopping(SAUSAGE)
        .addTopping(ONION).build();

    Calzone calzone = new Calzone.Builder()
        .addTopping(HAM).sauceInside().build();

    System.out.println(pizza);
    System.out.println(calzone);
  }
}
