package DesignPatterns.ObjectPoolPattern;

public class Main {
    public static void main(String[] args) {
        DbConnectionPoolManager connectionPoolManager = DbConnectionPoolManager.getInstance();
        DbConnection dbConnection1 = connectionPoolManager.getConnection();
        DbConnection dbConnection2 = connectionPoolManager.getConnection();
        DbConnection dbConnection3 = connectionPoolManager.getConnection();
        DbConnection dbConnection4 = connectionPoolManager.getConnection();
        DbConnection dbConnection5 = connectionPoolManager.getConnection();
        DbConnection dbConnection6 = connectionPoolManager.getConnection();
        connectionPoolManager.getConnection();
        connectionPoolManager.releaseConnection(dbConnection6);
    }
}
