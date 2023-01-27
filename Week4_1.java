package Week4;

// ส่วนใหญ่สร้าง class แบบแยกไฟล์
class Dogs{
    int age = 5;
    String name = "น้องหมา";
}
public class Week4_1 {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs();
        Dogs dog2 = new Dogs();
        
        dog2.name = "หมา2";// override attribute
        System.out.println("Dog2 age: " + dog1.age + "Name: " +dog2.name);
        System.out.println("Dog1 age: " + dog1.age);
        
        Week4_1Cats cat1 = new Week4_1Cats();
        cat1.age = 2;
        System.out.println("cat1: " + cat1.age + " " + cat1.color);
        
        Week4_1Student std1 = new Week4_1Student();
        std1.displayInfo();
        Week4_1Student std2 = new Week4_1Student("65xxxxx", "MyName", 2);
        std2.displayInfo();
        
        Week4_1Employee emp = new Week4_1Employee();
        emp.setName("Jame");
        System.out.println("Name: " + emp.getName());
        
        MotorBike msx = new MotorBike();
        msx.brand = "Honda";
        msx.run();
        msx.showBrand();
        
        Cars car = new Cars();
        car.run();
    } 
}
