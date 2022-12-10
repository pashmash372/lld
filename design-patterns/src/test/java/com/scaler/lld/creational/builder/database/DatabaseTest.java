package com.scaler.lld.creational.builder.database;

import org.junit.Assert;
import org.junit.Test;

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
}