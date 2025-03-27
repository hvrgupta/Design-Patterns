package ProxyDesignPatternLLD;

public interface EmployeeDAO {
    public void create(String client, EmployeeDo Obj) throws Exception;

    public void delete(String client, int employeeId) throws Exception;

    public EmployeeDo get(String client, int employeeId) throws Exception;
}