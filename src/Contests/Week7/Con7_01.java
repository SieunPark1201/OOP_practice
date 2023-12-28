package Contests.Week7;

public class Con7_01 {

    public static void main(String[] args) {

        int[] numberList = {10,20,15,2,23,90,67,85};
        int[] peaks = new int[numberList.length];
        int peaksnum = 0;
        int[] valleys = new int[numberList.length];
        int valleysnum =0;

        System.out.println("Given input array:");
        for (int i = 0; i < numberList.length ; i++) {
            System.out.print(numberList[i]);
            if ( i < numberList.length-1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println();

        if (numberList[0]>numberList[1]){
            peaks[peaksnum] = numberList[0];
            peaksnum++;
        } else if (numberList[0]<numberList[1]) {
            valleys[valleysnum] = numberList[0];
            valleysnum++;
        }

        for (int i = 1; i < numberList.length-1; i++) {
            if (numberList[i-1]<numberList[i] && numberList[i+1] < numberList[i]) {
                peaks[peaksnum] = numberList[i];
                peaksnum++;
            } else if ( numberList[i-1] > numberList[i] && numberList[i+1] > numberList[i]) {
                valleys[valleysnum] = numberList[i];
                valleysnum++;
            }
        }

        if (numberList[numberList.length-1]>numberList[numberList.length-2]){
            peaks[peaksnum] = numberList[numberList.length-1];
            peaksnum++;
        } else if (numberList[numberList.length-1] < numberList[numberList.length-2]) {
            valleys[valleysnum] = numberList[numberList.length-1];
            valleysnum++;
        }

        System.out.println("Peaks:");
        for (int i = 0; i < peaksnum ; i++) {
            System.out.print(peaks[i]);
            if ( i < peaksnum-1){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Valleys:");
        for (int i = 0; i < valleysnum ; i++) {
            System.out.print(valleys[i]);
            if ( i < valleysnum-1){
                System.out.print(" ");
            }
        }



    }

}



