package ProxyDesignPatternLLD;

public class EmployeeDo {
    private int employeeId;
    private String name;

    public EmployeeDo() {

    }

    public EmployeeDo(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
