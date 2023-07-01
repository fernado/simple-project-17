package pr.iceworld.fernando.designpattern.creational.singleton;

/**
 * 静态内部类
 * 外部类没有static属性，则不会像饿汉式那样立即加载对象。
 * 只有真正调用getInstance()，才会加载静态内部类。加载类时是线程安全的instance是static final类型，保证了内存中只有这样一个实例存在，而且只能被赋值一次，从而保证了线程安全性。
 * 兼备了并发高效调用和延迟加载的优势！
 */
public class SingletonObj_04 {

    private SingletonObj_04() {
    }

    public static final SingletonObj_04 getInstance() {
        return InterObj.SINGLETON_OBJ_01;
    }

    private static class InterObj {
        public final static SingletonObj_04 SINGLETON_OBJ_01 = new SingletonObj_04();
    }
}
