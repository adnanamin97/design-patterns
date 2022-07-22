package patterns.design.CorePatterns.Singleton;

import java.io.*;

public class TestClass {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/adnahassan/Documents/Developer Training/dateUtil.ser")));
        oos.writeObject(dateUtil1);

        DateUtil dateUtil2 = null;

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/adnahassan/Documents/Developer Training/dateUtil.ser"));
        dateUtil2 = (DateUtil) ois.readObject();

        oos.close();
        ois.close();

        System.out.println(dateUtil1 == dateUtil2);
    }
}
