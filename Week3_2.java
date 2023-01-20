/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author coc
 */
public class Week3_2 {
    public static void main(String[] args) {
  
        int divide = 8;
        for (int i = 1; i <= 500; i++){
            if( i % divide == 0){
                System.out.printf("%d, ", i);
            }
        }
//        Homework 3-1 Natasan Chantip 6530611021
        Scanner Num = new Scanner(System.in);
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
        
        //        Homework 3-2
            Scanner num = new Scanner(System.in);
            Scanner c = new Scanner(System.in);
            int n = 0;
            
            ArrayList<Integer> Allnum = new ArrayList<Integer>();
            while(true){
                
                n++;
                System.out.printf("Enter number %,d: ",n);
                int Number = Integer.parseInt(num.nextLine());
                
                System.out.print("Do you want to continue? [y/n]: ");
                String check = num.nextLine();
                
                
                
                if (check.equals("n") || check.equals("N")){
                    Allnum.add(Number);
                    break;
                }
                else if(check.equals("y") || check.equals("Y")){
                    Allnum.add(Number);
                }
                        }
            
            Collections.sort(Allnum);
            System.out.println("Ascending Order: " + Allnum);
            Collections.sort(Allnum,Collections.reverseOrder());
            System.out.println("Descending Order: " + Allnum);
              
                                 
    //    Homework 3-3
            Scanner cash = new Scanner(System.in);
            Scanner rate = new Scanner(System.in);
            Scanner year = new Scanner(System.in);
            
            System.out.print("Enter amount: ");
            float money = cash.nextFloat();
            
            System.out.print("Enter interest rate: ");
            int r = rate.nextInt();
            
            System.out.print("Enter period in yeras: ");
    }
            
                        }
        
   
