package patterns.design.CorePatterns.Template;

public class CSVDataRenderer extends DataRenderer{
    @Override
    public String readData() {
        return "Csv rendered";
    }

    @Override
    public String processData(String data) {
        return "Processing Data" + data;
    }
}
