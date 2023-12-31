package pr.iceworld.fernando.designpattern.creational.builder;

public interface Item {
    String name();

    Packing packing();

    float price();
}