package patterns.design.CorePatterns.AbstractFactory;

public class XMLEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("XMLEmpDao saving");
    }
}
