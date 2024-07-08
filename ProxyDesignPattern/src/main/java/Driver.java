public class Driver {

    public static void main(String[] args) {

        try {
            EmployeeDao employeeDao = new EmployeeProxy();
            employeeDao.create("USER", new Employee());
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
