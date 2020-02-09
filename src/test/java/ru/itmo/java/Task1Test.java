package ru.itmo.java;

import org.junit.Assert;
import org.junit.Test;

public class Task1Test {

    @Test
    public void test_get42() {
        Task1 inst = new Task1();

        Assert.assertEquals(42, inst.get42());
    }

}