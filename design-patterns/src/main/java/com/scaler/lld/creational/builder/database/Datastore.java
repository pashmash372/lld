package com.scaler.lld.creational.builder.database;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Datastore {

    private String host;
    private Integer port;
    private String username;
    private String password;
    private Long Id;
    private DatabaseType type;

    /* Step 1 - Hide your constructor */
    private Datastore() {
    }

    /* Add a static method to create builder instance */
    /* Also known as Static constructor */
    /* Also static intializer */
    public static DatastoreBuilder builder() {
        return new DatastoreBuilder();
    }

    /* Step 2 - Create builder class */
    @Setter
    public static class DatastoreBuilder {
        /* Step 3 - Copy all fields from outer class */
        private String host;
        private Integer port;
        private String username;
        private String password;
        private Long Id;
        private DatabaseType type;

        /* Step 5 - Add a build hook */
        public Datastore build() {
            Datastore datastore = new Datastore();
            datastore.host = host;
            datastore.port = port;
            datastore.type = type;

            return datastore;
        }
    }
}
