package patterns.design.CorePatterns.Template;

public class XMLDataRenderer extends DataRenderer{
    @Override
    public String readData() {
        return "XMLData rendered";
    }

    @Override
    public String processData(String data) {
        return "Processing Data" + data;
    }
}
