package pr.iceworld.fernando.designpattern.creational.singleton;

/**
 * 懒汉式就是延迟加载，也叫懒加载。在程序需要用到的时候再创建实例，保证了内存不会被浪费。
 */
public class SingletonObj_02 {

    private SingletonObj_02() {

    }

    private static SingletonObj_02 instance;

    
    public synchronized static SingletonObj_02 getInstance() {
        if (null == instance) {
            instance = new SingletonObj_02();
        }
        return instance;
    }

}
