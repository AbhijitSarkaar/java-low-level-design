package DesignPatterns.ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void getEmployeeInfo(int empId) {
        System.out.println("fetching info of employee with id " + empId);
    }

    @Override
    public void createEmployee() {
        System.out.println("creating employee");
    }
}
