package patterns.design.CorePatterns.AbstractFactory;

public class XMLDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("XMLDeptDao saving");
    }
}
