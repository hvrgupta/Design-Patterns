package ProxyDesignPatternLLD;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void create(String client, EmployeeDo Obj) throws Exception {
        System.out.println("Create new row");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Delete row");
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        System.out.println("fetch data");
        return new EmployeeDo();
    }

}
