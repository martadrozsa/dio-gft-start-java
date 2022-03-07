package singleton;

public class SingletonEager {

    private static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager() {
    }

    //já instância direto
    public static SingletonEager getInstance() {
        return singletonEager;
    }
}
