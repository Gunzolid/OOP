/*Name: Natasan Chantip
Std id: 6530611021
*/

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coc
 */
public class Week3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        System.out.print("Enter number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number2: ");
        int num2 = in.nextInt();
        System.out.print("Enter number3: ");
        int num3 = in.nextInt();
        System.out.print("Enter number4: ");
        int num4 = in.nextInt();
        System.out.print("Enter number5: ");
        int num5 = in.nextInt();
        
        int sum = (num1 + num2 + num3 + num4 + num5);
        float avg = (float)(sum/5);

        System.out.printf("Sum = %,15d\n", sum);
        System.out.printf("Average = %,12.2f\n", avg);
        */
        /*
//        Homework 2
        System.out.print("Total buy: ");
        int All = in.nextInt();
        
        int gold = (All/60);
        int sliver = ((All%60)/40);
        System.err.printf("gold stamp = %d\n", gold);
        System.err.printf("gold stamp = %d\n", sliver);
        
        
//        Homework 3
        System.out.print("Emter money: ");
        int Money = in.nextInt();
        
        int Bank1000 = Money/1000;
        int Bank500 = Money%1000/500;
        int Bank100 = Money%1000%500/100;
        int Bank50 = Money%1000%500%100/50;
        int Bank20 = Money%1000%500%100%50/20;
        int Allcash = (Bank1000 + Bank500 + Bank100 + Bank50 + Bank20);
        
        System.err.printf("cash 1000: %d\n", Bank1000);
        System.err.printf("cash 500 : %d\n", Bank500);
        System.err.printf("cash 100 : %d\n", Bank100);
        System.err.printf("cash 50  : %d\n", Bank50);
        System.err.printf("cash 20  : %d\n", Bank20);
        
        System.err.printf("All Bank : %d\n", Allcash);
        */
       
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("First");
        }
        else if(num == 2){
            System.out.println("Second");
        }
        else if(num == 3){
            System.out.println("Third");
        }
        else {
            System.out.println("Not allowed");
        }
        */
        
        /*
        int Num = sc.nextInt();
        switch(Num){
            case 1:
                System.out.println("First");
                break;
            case 2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
            default:
                System.out.println("Not allowed");
        }
        */
        
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        if (number >= 0){
            if ((number%2) == 0){
                System.out.printf("%d is  Positive Even Number\n", number);
            }
            else{
                System.out.printf("%d is  Positive Odd Number\n", number);
            }
        }    
        else {
            if ((number%2) == 0){
                System.out.printf("%d is  Negative Even Number\n", number);
            }
            else{
                System.out.printf("%d is  Negative Odd Number\n", number);
            }
        } 
    }
    
    
}
