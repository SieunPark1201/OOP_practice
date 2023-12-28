package Contests.Week13;

public class Con13_02 {
    public static void main(String[] args) {
        DataParser<String> parser1 = new DataParser<>("Hello World");
        System.out.println("Reversed: " + parser1.reverse());
        System.out.println("Capitalized: " + parser1.capitalize());
        System.out.println("Doubled Value: " + parser1.doubleValue());

        DataParser<Integer> parser2 = new DataParser<>(123);
        System.out.println("Reversed: " + parser2.reverse());
        System.out.println("Capitalized: " + parser2.capitalize());
        System.out.println("Doubled Value: " + parser2.doubleValue());
    }
}

class DataParser<T>{
    private T object;
    DataParser(T object){
        this.object = object;
    }
    public String reverse(){

        String reverseOb ="";

        for (int i = this.object.toString().length()-1 ; i >= 0 ; i--){
            reverseOb += this.object.toString().charAt(i);
        }

        return reverseOb.toString();

    }

    public String capitalize(){

        if ( this.object instanceof Number) {
            return this.object.toString();
        } else {
            return this.object.toString().toUpperCase();
        }
    }

    public String doubleValue(){

        if (this.object instanceof Number){

            Double doubleVal = ((Number) this.object).doubleValue();
            doubleVal *= 2;
            return doubleVal.toString();
        } else {
            return this.object.toString();
        }
    }



}
