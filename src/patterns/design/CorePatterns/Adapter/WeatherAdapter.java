package patterns.design.CorePatterns.Adapter;

public class WeatherAdapter {

    public int findTemperature(int zipcode) {
       String city = null;

       if(zipcode == 19406) {
           city = "London";
       }

       WeatherFinder finder = new WeatherFinderImpl();
       int temp  = finder.find(city);
        return temp;
    }
}
