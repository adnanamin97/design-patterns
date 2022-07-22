package patterns.design.CorePatterns.AbstractFactory;

public class DBEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("DBEmpDao");
    }
}
