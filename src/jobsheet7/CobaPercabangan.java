/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CobaPercabangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas = "Wahyu Aditya Utomo / X RPL 5 / 41";
        System.out.println("Identitas : " + identitas);
        
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.print("Nila a ? ");
        int a = scanner.nextInt();
        
        System.out.println("\nIF.. 1");
        if (a <5)System.out.println("nilai a kurang dari 5");
        
        System.out.println("\nIf.. 2");
        if (a==5) System.out.println("nilai a sama dengan 5");
        
        System.out.println("\nIf.. 3");
        if (a>5) 
            System.out.println("nilai a lebih dari 5");
        
        System.out.println("\nIF..ELSE..");
        if (a<5) {
            System.out.println("isi variabel a : " +a);
            System.out.println("nilai a kurang dari 5");
       }else {
               System.out.println("nilai variabel a lebih dari atau sama dengan 5");
        }
        
        
                    
        }
    }
    
    
