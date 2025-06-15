//Basic object creations and using the objects
class Car{
    String brand;
    public void varient(){
        System.out.println("Petrol");
        String str=engine("four Stroke");
        System.out.println(str);
    }
    private static String engine(String s){
        return s;
    }
    protected boolean testDrive(boolean attempt){
        return attempt;
    }

}

public class BasicObjects {
    public static void main(String[] args) {
        Car c=new Car();
        String brand=c.brand="Tesla";
        c.varient();
        System.out.println(brand);
        boolean test=c.testDrive(true);
        System.out.println(test);


    }
    
}