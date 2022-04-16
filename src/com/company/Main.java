package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    String text = "Hello hello java Java world";
        String[] words = text.split(" ");
        System.out.println(getStatisticMap(words));
    }
    private static Map<String, Integer> getStatisticMap(String[] words) {

    }
}
