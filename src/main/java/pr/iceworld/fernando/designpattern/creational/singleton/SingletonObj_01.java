package pr.iceworld.fernando.designpattern.creational.singleton;

/**
 * 饿汉式
 * 立即加载，也就是在类加载的时候立即实例化对象,在调用getInstance()之前就已经产生实例。
 * 这种方式优点没有加锁，执行效率提高；缺点是类加载时就初始化，浪费内存。
 */
public class SingletonObj_01 {

    private SingletonObj_01() {

    }

    private static SingletonObj_01 instance = new SingletonObj_01();

    public static SingletonObj_01 getInstance() {
        return instance;
    }

}
