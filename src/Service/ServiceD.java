package Service;

public class ServiceD {
    public ServiceC serviceC;
    public void methodD() {
        System.out.println("class {ServiceC} method called");
        serviceC.methodC();
    }
}
