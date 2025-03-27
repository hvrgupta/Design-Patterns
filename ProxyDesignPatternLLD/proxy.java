package ProxyDesignPatternLLD;

public class proxy {
    public static void main(String[] args) {
        try {
            EmployeeDAO empObj = new EmployeeDAOProxy();
            empObj.create("USER", new EmployeeDo());
            System.out.println("Operation Success");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
