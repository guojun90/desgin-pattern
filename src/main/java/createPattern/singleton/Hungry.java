package createPattern.singleton;

/**
 * 单例模式-饿汉式
 * 1、在类加载时就完成初始化
 * 2、线程安全，但在可能类加载后，还未使用到该实例时就进行了实例化，造成资源浪费
 */
public class Hungry {

    private static Hungry instance = new Hungry();

    private Hungry() {

    }

    public static Hungry getInstance() {
        return instance;
    }

}
