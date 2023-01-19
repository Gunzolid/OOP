/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author coc
 */
public class Week4 {
    public static void main(String[] args) {
        
        Scanner Num = new Scanner(System.in);
        ArrayList<String> animal = new ArrayList<String>();
        animal.add("Dog");
        animal.add("Cat");
        System.out.println(animal);
        System.out.println(animal.get(1));
        animal.set(0, "Fish");
        animal.add("Aaaa");
        
        
        /*
        int divide = 8;
        for (int i = 1; i <= 500; i++){
            if( i % divide == 0){
                System.out.printf("%d, ", i);
            }
        }
        */
        
        /*
        while(true){
            System.out.println("Hello");
        }
        */
        
        /*
        Pratice 3-1
        int Allscore = 0;
        while (true){
            System.out.print("Enter score[0 to exit]: ");
            int Score = Num.nextInt();
            
            if (Score == 0){
                break;
            }
            
            else if (Score >= 1 && Score <= 100){
                Allscore = Allscore + Score;
            }
            
            else{
                System.err.println("Score allows only 1-100");
            }
        }
        System.out.printf("Sum of score is: %d \n", Allscore);
        */
//        Homework 3-1
        Scanner Net = new Scanner(System.in);
        while(true){
            System.out.println("========== Input ==========");
            System.out.print("Salary: ");
            
            int salary = Num.nextInt();
            double commissionRate = 0;
            if (salary == 0){
                break;
            }
            else{
                System.out.print("Net Sale: ");
                int Netsale = Net.nextInt();
                if (0 <=  Netsale && Netsale <= 50000){
                    commissionRate = 0;
                    } 
                else if (50001 <= Netsale && Netsale <= 100000){
                    commissionRate = 0.05;
                    }
                else if (100001 <= Netsale && Netsale <= 200000){
                    commissionRate = 0.10;
                    }
                else if( Netsale > 200000){
                    commissionRate = 0.15;
                    }
                System.out.printf("Commission %.0f%% = %,11.2f \n", commissionRate * 100, (Netsale * commissionRate));
                System.out.printf("Total         = %,11.2f \n", salary + (Netsale * commissionRate));
            }
        }
    }
    
}

