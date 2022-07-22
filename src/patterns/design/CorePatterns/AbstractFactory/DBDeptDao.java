package patterns.design.CorePatterns.AbstractFactory;

public class DBDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("DBDEPTDao saving");
    }
}
