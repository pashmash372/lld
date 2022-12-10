package com.scaler.lld.creational.builder.database;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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

    @Test()
    public void testBuilder() {
        Datastore datastore = Datastore.builder().mysql(DatabaseType.MY_SQL).withHost("localhost").build();
        Assert.assertEquals("If host setter is called , host should be local host", "localhost", datastore.getHost());
        Assert.assertEquals("If host setter is called , type should be MYSQL", DatabaseType.MY_SQL, datastore.getType());
    }

    @Test()
    public void testBuilder1() {
        Datastore datastore = Datastore.builder().init("localhost", 3306).build();
        Assert.assertEquals("If host setter is called , host should be local host", "localhost", datastore.getHost());
        Assert.assertEquals("If host setter is called , type should be MYSQL", DatabaseType.MY_SQL, datastore.getType());
    }

    @Test(expected = RuntimeException.class)
    public void testBuilderWithNoType() {
        Datastore.builder().build();
    }

    @Test
    public void testLombokBuilder() {
        Database database = Database.builder().host("localhost").port(3306).build();
        Assert.assertEquals("If host setter is called , host should be local host", "localhost", database.getHost());
        Assert.assertEquals(Optional.of(3306).get(), database.getPort());

    }

}