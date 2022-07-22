package patterns.design.CorePatterns.Adapter;

public class WeatherUi {

    public void showTemperature(int zipcode){
        WeatherAdapter wa = new WeatherAdapter();
        wa.findTemperature(zipcode);

        System.out.println(wa.findTemperature(zipcode));
    }

    public static void main(String[] args) {
        WeatherUi ui = new WeatherUi();

        ui.showTemperature(19406);
    }
}
