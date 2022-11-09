public class WeatherChannel {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        Display[] displays = {
                new CurrentConditions(ws),
                new StatisticsDisplay(ws),
                new ForecastDisplay(ws),
        };
        for (Display d : displays) {
            d.update();
        }
    }
}
