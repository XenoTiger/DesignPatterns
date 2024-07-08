public class EmployeeDaoImp implements EmployeeDao{

    @Override
    public void create(String client, Employee employee) throws Exception {
        System.out.println("Created new Employee");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("Deleted Employee with " + employeeId);
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        System.out.println("Fetching employee details");
        return new Employee();
    }
}
