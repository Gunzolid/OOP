package Week4;
public class Cars {
    protected String brand;
   
    public void run(){
        System.out.println("Car is running");
    }
    
    public void showBrand(){
        System.out.println("Brand is " + this.brand);
    }
}
