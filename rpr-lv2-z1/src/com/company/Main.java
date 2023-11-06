package com.company;

public class Main {
    public static int Factorial(int n) {
        int fakt= 1;
        for(int i=2; i<=n; i++)
            fakt*=i;
        return fakt;
    }
    public static double Sine(double n) {
        return Math.sin(n);
    }
    public static void main(String[] args) {
	// write your code here
        System.out.println(args[0]);
        int fakt = Factorial(Integer.parseInt(args[0]));
        double sins = Sine(Double.parseDouble(args[0]));
        System.out.println("Faktorijel: " + fakt);
        System.out.println("Sinus: " + sins);
    }
}
