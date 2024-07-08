/**
 * This class represents Proxy pattern, here we are implementing Employee CRUD ops.
 * This class acts as a layer between client and server.
 * and it can have additional functionality based on requirement.
 * Here, its act as a Security layer.
 *
 * @author Niraj_Bhoyar
 */

public class EmployeeProxy implements EmployeeDao {

    EmployeeDao employeeDao;

    public EmployeeProxy() {
        employeeDao = new EmployeeDaoImp();
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDao.create(client, employee);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN")) {
            employeeDao.delete(client, employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if (client.equals("ADMIN") || client.equals("USER")) {
            return employeeDao.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }
}
