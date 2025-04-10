public class ConversorTemperatura {
    public static void main(String[] args) {
        double tempCelsius= 36.05;
        System.out.println("**************************************************");
        System.out.println("La temperatura en grados Celsius es de: "+ tempCelsius);
        double tempFahrenheit= (tempCelsius*1.8)+32;
        System.out.println(String.format("La temperatura en grados Celsius de %f es equivalente a grados Fahrenheit %f",tempCelsius, tempFahrenheit));

        int tempFarInt = (int)tempFahrenheit;
        System.out.println("Redondeando la Temperatura Fahrenheit es: "+tempFarInt);
        System.out.println("**************************************************");


    }
}
