/*
 * An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A
company manager wants to make the production of both types of vehicle according to the
given data below:
1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as
per the given data.

 */

import java.util.Scanner;

public class VehicleProduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt(); // total vehicles
        int W = sc.nextInt(); // total wheels

        // if (W % 2 != 0 || W < 2 * v || W > 4 * v) {
        //     System.out.println("Invalid Input");
        //     return;
        // }

        int fw = (W - 2 * v) / 2;
        int tw = v - fw;

        System.out.println("Two Wheelers = " + tw);
        System.out.println("Four Wheelers = " + fw);   
    }
}