/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
    
/**
 *
 * @author coc
 */
import java.util.Scanner;

public class Week3 {
    public static void main(String[] args) {
        String word = "Hello";
        int a = 10;
        
//        วิธีแปลงค่าตัวแปร ทำได้หลายวิธี
        word = String.valueOf(a);
        word = Integer.toString(a);
        
        a = Integer.parseInt(word);
        a = Integer.valueOf(word);
        
        System.err.println("word is " + word);
        System.out.println("a is " + a);
        
        
        int count = 0;
//        count += 1;
//        count -= 1;
//        count --;
//        count ++;

//        Scanner ใช้รับค่า Input ประกาศแค่ครั้งเดียว
        Scanner in = new Scanner(System.in);

//         มี ln เหมือนขึ้นบรรทัดใหม่
        System.out.println("What is your name?");
////         ไม่มี ln อยู่บรรทัดเดิม
//         System.out.print("What is your name?");
        
        String name = in.nextLine();
        System.out.println("Mame: " + name);
        
        System.out.println("How old are you?");
        
////        ทำได้ 2 วิธี
//        String age = in.nextLine();
//        System.out.println("Age: " + Integer.valueOf(age));
//        
//        int Age = in.nextInt();
//        System.out.println("Age: " + (Age + 10));
        
        float x = 1234.56789f;
        int y = 123;
        
//        ใช้คำสั่งภาษา C ได้ 5 หมายถึงเว้นไว้ 5 ช่อง 
        System.out.printf("x is %,5.2f\n", x);
        System.out.printf("y is %5d\n", y);

//        ใช้ของ java
        String str = String.format("x is %,20.2f\n", x);
        System.out.println(str);
        
        
        
        System.out.println("Program calcurate Triangle.");
        System.out.print("Enter height: ");
        float height = in.nextFloat();
        System.out.print("Enter base: ");
        float base = in.nextFloat();
        
        float area = (float)(0.5 * height * base);
        System.out.printf("Triangle area is 1/2 x %.3f x %.3f = %.3f\n", height , base, area);
        
    }
    
}
