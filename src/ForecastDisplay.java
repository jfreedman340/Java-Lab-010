public class ForecastDisplay implements Display{
    WeatherStation ws;
    float currentPressure;
    float lastPressure;

    public ForecastDisplay (WeatherStation ws) {
        update();
        display();
    }

    @Override
    public void update() {
        this.currentPressure = ws.getPressure();
    }

    @Override
    public void display() {
        System.out.println("The current pressure is: " + currentPressure);
    }
}
