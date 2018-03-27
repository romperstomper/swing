package learn;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
        double payment = 22.23;

        // Write your code here.
        Locale india = new Locale("en", "IN");

        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println(NumberFormat.getCurrencyInstance(india).format(payment));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
    }
}