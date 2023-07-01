package pr.iceworld.fernando.designpattern.creational.abstractfactory;

import pr.iceworld.fernando.designpattern.creational.factory.Shape;

public class Rectangle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}