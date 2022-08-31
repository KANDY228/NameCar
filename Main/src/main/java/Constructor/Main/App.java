package Constructor.Main;

public class App 
{
    public static void main( String[] args )    {
    	Car c1,c2,c3;
    	c1= new Car("Myibah");
    	c2 = new Car("Renault");
    	c3 = new Car("Sitroen");
    	System.out.println("App: Main: c1.getCarModel() ="+c1.getCarModel());
    	System.out.println("App: Main: c2.getCarModel() ="+c2.getCarModel());
    	System.out.println("App: Main: c3.getCarModel() ="+c3.getCarModel());
    }
}
