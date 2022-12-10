package com.scaler.lld.creational.builder.database;

public class Database {
    private String host;
    private Integer port;
    private String username;
    private String password;
    private Long Id;
    private DatabaseType type;

    public Database(String host, Integer port, String username, String password, Long id, DatabaseType type) {
        this.host = host;
        if (port < 2000) {
            throw new RuntimeException("Invalid port");
        }
        this.port = port;
        this.username = username;
        this.password = password;
        Id = id;
        this.type = type;
    }

    public Database(String host, Integer port, DatabaseType type) {
        /* this is telescoping anti pattern is */
        /* anti pattern means you should never use this piece of code */
        /* huge parameter list , */
        new Database(host, port, null, null, null, type);
    }

    public Database(DatabaseType type) {
        this(null, null, type);
    }
}
