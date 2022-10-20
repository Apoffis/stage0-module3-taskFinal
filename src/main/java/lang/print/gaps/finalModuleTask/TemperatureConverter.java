package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {

    public void toFahrenheit(int temperatureCelsius){
        float index = 9 / (float)5;
        System.out.println(temperatureCelsius * index + 32);
    }
}
