package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static double Mean (List<Double> l) {
        double avg=0;
        for(int i=0; i<l.size(); i++) {
            avg += l.get(i);
        }
        return avg/l.size();
    }
    public static double Minimum (List<Double> l) {
        double min=l.get(0);
        for(int i=1; i<l.size(); i++) {
            if(l.get(i)<min) min = l.get(i);
        }
        return min;
    }
    public static double Maximum (List<Double> l) {
        double max = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            if (l.get(i) > max) max = l.get(i);
        }
        return max;
    }
    public static double StandardDeviation (List<Double> l) {
        double std_dev = 0;
        double avg = Mean(l);
        for (int i=1;i<l.size();i++) {
            std_dev = std_dev + l.get(i) + Math.pow(l.get(i) - std_dev,2);
        }
        return Math.sqrt(std_dev/l.size());
    }
    public static void main(String[] args) {
        List<Double> lista = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite brojeve ili stop rijec za kraj: ");
        while(true) {

            String userInput = sc.next();
            if(userInput.equals("stop")) break;
            else {
                try {
                    double broj = Double.parseDouble(userInput);
                    lista.add(broj);
                } catch(NumberFormatException e) {
                    System.out.println("Neispravan unos, pokusajte ponovo: ");
                }
            }
        }

        System.out.println("Najmanji element u listi je: " + Minimum(lista));
        System.out.println("Najveci element u listi je: " + Maximum(lista));
        System.out.println("Srednja vrijednost elemenata u listi je:  " + Mean(lista));
        System.out.println("Srednja devijacija elemenata u listi je:  " + StandardDeviation(lista));

    }
}
