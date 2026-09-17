package DesignPatterns.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        ProxyEmployeeDao proxyEmployeeDao = new ProxyEmployeeDao("USER");
        proxyEmployeeDao.getEmployeeInfo(1);
        proxyEmployeeDao.createEmployee();
    }
}
