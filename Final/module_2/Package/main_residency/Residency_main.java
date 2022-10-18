package main_residency;

import residency.*;

public class Residency_main {
    public static void main(String[] args) {
        LuxuriousResidency r1 = new LuxuriousResidency("PYTHON", 1,2000,63);
        System.out.println("The price of Luxurious Residency is: "+r1.getPriceOfResidency());
        Semi_FurnishedResidency r2 = new TwoBHKResidency("JAVA", 2, 1000, 50);
        System.out.println("The price of Semi Furnished Residency Residency is:"+r2.getPriceOfResidency());
        System.out.println("Rent of 2 BHK  Semi Furnished Residency is :"+((Rentable) r2).getRent());
        
    }
}