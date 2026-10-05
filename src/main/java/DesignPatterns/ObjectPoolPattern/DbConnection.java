package DesignPatterns.ObjectPoolPattern;

public class DbConnection {
    Connection mysqlConnection;

    public DbConnection() {
        this.mysqlConnection = new Connection("url", "username", "password");
    }

    public Connection getMysqlConnection() {
        return mysqlConnection;
    }
}
