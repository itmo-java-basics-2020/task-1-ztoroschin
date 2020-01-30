package ru.itmo.java;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lab1Test {

    @Test
    public void test_emptyArray() {
        Lab1 inst = new Lab1();

       assertEquals("", inst.joinArrayElements(new int[]{}));
    }

}