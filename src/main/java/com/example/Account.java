package com.example;

public class Account {

    private final String name;
    boolean onlySingleSubstring(String str, String subStr) {
        return str.indexOf(subStr) == str.lastIndexOf(subStr);
        }

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return name.length() >= 3 && name.length() <= 19 && name.contains(" ") & onlySingleSubstring(name, " ") && !name.startsWith(" ") && !name.endsWith(" ");
    }
}




