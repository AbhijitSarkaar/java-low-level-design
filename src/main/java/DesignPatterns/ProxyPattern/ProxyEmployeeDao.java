package DesignPatterns.ProxyPattern;

public class ProxyEmployeeDao implements EmployeeDao {

    EmployeeDao employeeDao;
    String clientRole;

    public ProxyEmployeeDao(String clientRole) {
        employeeDao = new EmployeeDaoImpl();
        this.clientRole = clientRole;
    }

    @Override
    public void getEmployeeInfo(int empId) {
        if(clientRole.contains("ADMIN") || clientRole.contains("USER")) {
            employeeDao.getEmployeeInfo(empId);
        } else {
            throw new RuntimeException("Permission denied");
        }
    }

    @Override
    public void createEmployee() {
        if(clientRole.contains("ADMIN")) {
            employeeDao.createEmployee();
        } else {
            throw new RuntimeException("Permission denied");
        }
    }
}
