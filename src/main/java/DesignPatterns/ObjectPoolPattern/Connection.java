package DesignPatterns.ObjectPoolPattern;

public class Connection {
    String url;
    String username;
    String password;

    public Connection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
}
