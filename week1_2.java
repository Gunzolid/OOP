public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.err.println("HELLO");
        System.out.print("hello");
    }
}

public class ch2_1 {
    public static void main(String[] args) {
        int Num = 10;
        float Float = 1.23456f;
        char Letter = 'A';
        String Text = "Hello World";
        System.out.println("My Number is " + Num);
        System.out.println("My Float is " + Float);
        System.out.println("My Letter is " + Letter);
        System.out.println("My Letter is " + (int)Letter);
        System.out.println("My Text is " + Text);
        System.out.println("My Text is " + Text + " Java");
        Text = "Java";
        System.out.println("My Text is " + Text);
        System.out.println("My Text is " + Text + Num);
        System.out.println("My Text is " + Text + Num);
      
        System.out.println("My Num + 100 = " + (Num + 100));
        // + คือการต่อข้อความ
        System.out.println("My Num + 100 = " + Num + 100);
        // + ในวงเล็บคือกระบวกการ
    }
}
