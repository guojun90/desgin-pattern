package createPattern.singleton;

/**
 * 单例模式 - 懒汉式
 * 1、第一次使用时才创建实例
 * 2、获取对象时需要考虑线程安全问题，需要在获取实例对象时加锁
 */
public class Lazy {

    private static Lazy instance;

    private Lazy(){

    }

    public static synchronized Lazy getInstance(){
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
