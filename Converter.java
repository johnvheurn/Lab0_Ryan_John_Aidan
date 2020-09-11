public class Converter {
    //Your names go here:
    /*
     * @Author: Ryan Raimondo
     * John Van Heurn
     * Aidan Lee
     *
     */
    private double celsiusToFahrenheit(double C){
        //TODO: The third student will implement this method

        return ((C*(9/5)) + 32);
    }
    private double fahrenheitToCelsius(double F){
        // The second student will implement this method
        return (5*(F-32)/9);

    }
    public static void main(String[] args) {
        celsiusToFahrenheit(180);
        fahrenheitToCelsius(250);
    }
}
