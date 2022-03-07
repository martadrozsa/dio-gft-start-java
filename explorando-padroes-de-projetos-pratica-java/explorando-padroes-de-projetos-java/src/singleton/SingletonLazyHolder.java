package singleton;

public class SingletonLazyHolder {

    //encapsula a instância
    private static class InstanceHolder {
        public static SingletonLazyHolder singletonLazyHolder = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.singletonLazyHolder;
    }
}
