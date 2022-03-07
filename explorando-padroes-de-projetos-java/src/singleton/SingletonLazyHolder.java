package singleton;

public class SingletonLazy {


    private static SingletonLazy singletonLazy;

    private SingletonLazy() {
    }

    //faz a verificação
    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }
}
