package pr.iceworld.fernando.designpattern.creational.singleton;

/**
 * 双重检测锁式（DCL，即double-checked locking）
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。getInstance() 的性能对应用程序很关键。
 */
public class SingletonObj_03 {

    private SingletonObj_03() {

    }

    private static SingletonObj_03 instance;

    
    public synchronized static SingletonObj_03 getInstance() {
        if (null == instance) {
            synchronized (SingletonObj_03.class) {
                if (null == instance) {
                    instance = new SingletonObj_03();
                }
            }
        }
        return instance;
    }

}
