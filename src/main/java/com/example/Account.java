package com.example;

public class Account {

    private final String name;

       public Account(String name) {
            this.name = name;
        }

    public boolean checkNameToEmboss() {
        return name.matches("(?=.{3,19}$)[а-яА-ЯёЁa-zA-Z0-9]+\\s{1}[а-яА-ЯёЁa-zA-Z0-9]+");
    }
}




