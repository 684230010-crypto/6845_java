package Arrays;

import java.util.Scanner;

public class W15_02_sumNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a [] = new double [5];

        // Input numbers from keybord
        for( int i=0; a.length;i++){
            System.out.println("Enter Number " + (i+1) ":" );
            a[i] = kb.nextDouble();

        }
        double sumAll = 0; // sum all number
        double sumOdd = 0; // sum odd number
        double sumEven = 0; // sum even number
        double average = 0;
        double  max = 0;
        double min = 0;


        // show all number
        System.out.println("Show all number : ");
        for(int i=0 ;i<a.length ; i++){
            System.out.println("index [" + 1 + "]value = " + a[i]);
            sumAll += a[i];
            if([i] % 2 !=0) {
                sumOdd +=a[i];
            } else {
                sumEven +=a[i];
            }
            

            if(a[i] > max){
                max = a[i]
            }

            if(a[i] < min ){
                min = a[i];
            }
        
        System.out.println("sum of all number = " + sumAll);
        System.out.println("sum of odd number = " + sumOdd);
        System.out.println("sum of even number =" + sumEven);
        System.out.println("Max number ="+ max);
        System.out.println("Min number =" + min);

        average = sumAll / a.length;
        System.out.println("Average of all number = " + average);

        kb.close();
    
    }
}
} 
