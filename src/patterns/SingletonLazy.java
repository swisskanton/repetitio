package patterns;

import java.io.Serial;
import java.io.Serializable;

public class SingletonLazy implements Serializable {

    public String str;
    private static SingletonLazy obj;

    private SingletonLazy(){}

    public static SingletonLazy getSingleInstance() {
        if (obj == null)
            obj = new SingletonLazy();
        return obj;
    }

    @Serial
    protected Object readResolve() {
        return getSingleInstance();
    }
}
