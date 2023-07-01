package pr.iceworld.fernando.designpattern.creational.abstractfactory;

import pr.iceworld.fernando.designpattern.creational.factory.Shape;

public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}