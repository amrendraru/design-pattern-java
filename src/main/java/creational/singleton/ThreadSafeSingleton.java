package creational.singleton;

import javax.swing.plaf.TableHeaderUI;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton() {}

    public   ThreadSafeSingleton getInstance() {

        synchronized (instance) {
            if(instance == null) {
                instance = new ThreadSafeSingleton();
            }

            return instance;
        }


    }


}
