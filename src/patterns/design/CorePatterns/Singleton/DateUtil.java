package patterns.design.CorePatterns.Singleton;

import java.io.Serializable;

/**
 * Singleton classes only return one instance of an object. Every instantitation of this class will be equal in terms of object in memory
 *
 * to make sure our singleton is 'thread-safe' ie multiple classes trying to access this method, still only one instance is created. synchronized key
 * word allows the getInstance method to be thread-safe. only one thread can access the method
 */
public class DateUtil implements Serializable, Cloneable {

    private static volatile DateUtil instance;

    private DateUtil() {}

    public static DateUtil getInstance() {
       if(instance == null ) {
           synchronized (DateUtil.class) {
               if (instance == null) {
                instance = new DateUtil();
               }
           }
       }
       return instance;
    };

    public Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
