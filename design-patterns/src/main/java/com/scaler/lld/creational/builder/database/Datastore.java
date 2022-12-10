package com.scaler.lld.creational.builder.database;

import lombok.Getter;

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
    public static class DatastoreBuilder {
        /* Step 3 - Copy all fields from outer class */
        private String host;
        private Integer port;
        private String username;
        private String password;
        private Long Id;
        private DatabaseType type;

        /* Step 4 - Add fluent interfaces for setters */
        public DatastoreBuilder withHost(String host) {
            this.host = host;
            return this;
        } /* Step 4 - Add fluent interfaces for setters */

        public DatastoreBuilder init(String host, Integer port) {
            this.host = host;
            this.port = port;
            return this;
        }

        public DatastoreBuilder mysql(DatabaseType type) {
            this.type = type;
            return this;
        }

        /* Step 5 - Add a build hook */
        public Datastore build() {
            boolean isValid = validate();
            if (!isValid) throw new RuntimeException("Object is not valid");
            Datastore datastore = new Datastore();
            datastore.host = host;
            datastore.port = port;
            datastore.type = type;

            return datastore;
        }

        private boolean validate() {
            return type != null;
        }
    }
}


/* Assignment - Fix the duplicate fields in builder class */