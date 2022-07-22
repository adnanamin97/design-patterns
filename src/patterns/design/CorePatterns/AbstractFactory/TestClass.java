package patterns.design.CorePatterns.AbstractFactory;

public class TestClass {

    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoProducer.produce("xml");
        Dao dao = daf.createDao("emp");

        dao.save();
        }
}
