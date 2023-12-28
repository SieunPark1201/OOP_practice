package Contests.Week4;

public class Con3_2 {
    public static void main(String[] args) {
        Temperature myTemp1 = new Temperature(32.0);  // creating a temperature with Fahrenheit 32.0
        System.out.println(myTemp1);

        Temperature myTemp2 = new Temperature(32.0, 0.0);  // creating a temperature with 32.0F and 0.0C
        myTemp2.setTemperature(100.0, true);  // setting the temperature in Celsius 100.0
        System.out.println(myTemp2);

        System.out.println("myTemp1 == myTemp2 ? " + myTemp1.equals(myTemp2));
    }
}

// your code here
class Temperature {
    private double fahr = 0.0;
    private double cels = 0.0;
    private double kelv = 0.0;

    public Temperature(double fahr) {
        this.fahr = fahr;
        this.cels = (fahr - 32) * 5 /9;
        this.kelv = cels + 273.15;
    }

    public Temperature(double fahr, double cels) {
        this.fahr = fahr;
        this.cels = cels;
        this.kelv = cels + 273.15;
    }

    public void setTemperature(double cels, boolean TorF) {
        if (TorF) {
            this.cels = cels;
            this.kelv = cels + 273.15;
            this.fahr = (cels * 9 / 5) + 32;
        }
    }

    public boolean equals(Temperature temp){
        if (this.toString().equals(temp.toString())){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "Fahrenheit: "+ fahr +", Celsius: "+ cels +", Kelvin: "+ kelv;
    }

}
