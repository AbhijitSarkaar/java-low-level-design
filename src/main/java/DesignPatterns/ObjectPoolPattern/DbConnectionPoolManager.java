package DesignPatterns.ObjectPoolPattern;

import java.util.ArrayList;
import java.util.List;

public class DbConnectionPoolManager {
    private List<DbConnection> freeAvailableConnections = new ArrayList<>();
    private List<DbConnection> currentlyInUseConnections = new ArrayList<>();
    private final int INITIAL_POOL_SIZE=3;
    private final int MAX_POOL_SIZE=6;
    private static DbConnectionPoolManager dbConnectionPoolManagerInstance;

    private DbConnectionPoolManager() {
        for(int i = 0; i < INITIAL_POOL_SIZE; ++i) {
            freeAvailableConnections.add(new DbConnection());
        }
    }

    public static DbConnectionPoolManager getInstance() {
        if(dbConnectionPoolManagerInstance == null) {
            synchronized (DbConnectionPoolManager.class) {
                if(dbConnectionPoolManagerInstance == null) {
                    dbConnectionPoolManagerInstance = new DbConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManagerInstance;
    }

    public synchronized DbConnection getConnection() {
        if(freeAvailableConnections.isEmpty() && currentlyInUseConnections.size() < MAX_POOL_SIZE) {
            freeAvailableConnections.add(new DbConnection());
        }
        if(freeAvailableConnections.isEmpty() && currentlyInUseConnections.size() >= MAX_POOL_SIZE) {
            return null;
        }
        DbConnection connection = freeAvailableConnections.getLast();
        freeAvailableConnections.remove(connection);
        currentlyInUseConnections.add(connection);
        return connection;
    }

    public synchronized void releaseConnection(DbConnection connection) {
        currentlyInUseConnections.remove(connection);

        freeAvailableConnections.add(connection);
    }
}
