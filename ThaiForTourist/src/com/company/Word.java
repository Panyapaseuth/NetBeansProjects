package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class Word {
    private static Map<String, String > words = new LinkedHashMap<>();

    static {
        words.put("Hello", "Swatdee");
    }
}
