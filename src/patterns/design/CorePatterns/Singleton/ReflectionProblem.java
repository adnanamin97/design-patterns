package patterns.design.CorePatterns.Singleton;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * We can break our singleton by using Java reflect api as shown below, the hashcodes will be different
 */
public class ReflectionProblem {

    public static void main(String[] args) {
        DateUtil i1 = DateUtil.getInstance();
        DateUtil i2 = null;

       Constructor[] constructors =  DateUtil.class.getDeclaredConstructors();
        for (Constructor constructor: constructors) {
            // this makes the constructor public so makes the private constructor reduntant. we can use an enum to solve this issue
            constructor.setAccessible(true);
            try {
                i2 = (DateUtil) constructor.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
    }
}
