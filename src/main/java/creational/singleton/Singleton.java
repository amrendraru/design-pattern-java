package creational.singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {}

    private Singleton getInstance() {

        if(instance==null) {
            instance = new Singleton();
        }

        return instance;
    }

}
