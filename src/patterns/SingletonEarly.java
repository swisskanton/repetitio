package patterns;

import java.io.Serial;
import java.io.Serializable;

public class SingletonEarly implements Serializable {

    private static SingletonEarly obj = new SingletonEarly();

    private SingletonEarly() {}

    public static SingletonEarly getSingleInstance() {
        return obj;
    }

    @Serial
    protected Object readResolve() {
        return getSingleInstance();
    }
}
