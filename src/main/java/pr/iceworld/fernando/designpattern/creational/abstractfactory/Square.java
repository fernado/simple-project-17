package pr.iceworld.fernando.designpattern.creational.abstractfactory;

import pr.iceworld.fernando.designpattern.creational.factory.Shape;

public class Square implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}