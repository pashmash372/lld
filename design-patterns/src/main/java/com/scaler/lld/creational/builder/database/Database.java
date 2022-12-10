package com.scaler.lld.creational.builder.database;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
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

    public Database(Map<String, Object> values) {
        this.host = (String) values.get("host");
        this.port = (Integer) values.get("port");
        this.type = (DatabaseType) values.get("type");
    }
}
