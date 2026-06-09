public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 35.0;

        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println("Temperature in Celsius = " + celsius);
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}