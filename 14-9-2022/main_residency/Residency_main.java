package main_residency;

import residency.*;
public class Residency_main {
    public static void main(String[] args) {
        residency.Semi_FurnishedResidency r = new Semi_FurnishedResidency("JAVA", 7, 1800, 45);
        System.out.println(r.getPriceOfResidency());

        residency.LuxuriousResidency r1 = new LuxuriousResidency("PYTHON", 1,2000,63);
        System.out.println(r1.getPriceOfResidency());
        
        Rentable r2 = (Rentable)r;
    
        System.out.println(r2.getRent());
        
    }
}