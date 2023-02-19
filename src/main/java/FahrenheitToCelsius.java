public class FahrenheitToCelsius {

    public static double ConvertToCelcius() {
        double fahrenheit = 45;
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celcius");
        return celsius;
    }
    public static void main(String[] args){}

}