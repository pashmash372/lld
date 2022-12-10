package com.scaler.lld.creational.builder.database;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DatabaseTest {

    @Test
    public void testConstructor() {
        Database database = new Database("localhost", 4533, "password", "username", 1L, DatabaseType.MY_SQL);
        Assert.assertNotEquals("If constructor is called ,object should not be null", database);
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidPort() {
        Database database = new Database("localhost", 1999, "password", "username", 1L, DatabaseType.MY_SQL);
        Assert.assertNotEquals("If constructor is called ,object should not be null", database);
    }

    @Test()
    public void testSetters() {
        Database database = new Database();
        database.setHost("localhost");
        database.setPort(4553);
        Assert.assertEquals("If host setter is called , host should be local host", "localhost", database.getHost());
    }

    @Test
    public void testHashMapConstructor() {
        Map<String, Object> values = new HashMap<>();
        values.put("host", "localhost");
        values.put("port", 3306);
        values.put("type", DatabaseType.MY_SQL);

        Database database = new Database(values);
        Assert.assertEquals("If host setter is called , host should be local host", "localhost", database.getHost());
        Assert.assertEquals("If host setter is called , type should be MYSQL", DatabaseType.MY_SQL, database.getType());
    }

    @Test(expected = AssertionError.class)
    public void testBuilder() {
        /*Datastore.DatastoreBuilder datastore = new Datastore.DatastoreBuilder();*/
        Datastore database = Datastore.builder().build();
        Assert.assertEquals("If host setter is called , host should be local host", "localhost", database.getHost());
        Assert.assertEquals("If host setter is called , type should be MYSQL", DatabaseType.MY_SQL, database.getType());
    }

}