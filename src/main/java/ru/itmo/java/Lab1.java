package ru.itmo.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Lab1 {

    String joinArrayElements(int[] array) {
        return Arrays.stream(array)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining());
    }
}
