package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expected;


    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][]{
                {"pr", false},                      //2 символа без пробела
                {"p ri", true},                     //3 символа с пробелом
                {"1 ТимотиШаламеТимо", true},       // 18 символов включая пробел в середине
                {"1 ТимотиШаламеТимот", true},     // 19 символов включая пробел в середине
                {"1 45", true},                   //4 символа включая пробел в середине
                {"1 ТимотиШаламеТимоти", false},  //20 символов включая пробел в середине
                {" ", false},                    //пробел
                {"", false},                    //пустая строка
                {" privet", false},            //пробел в начале строки
                {"privet ", false},           //пробел в конце строки
                {"pri  vet", false},         // Более одного пробела в середине
                {"ТимотиШаламе", false}      // отсутствующий пробел в середине

        };
    }

    @Test
    public void shouldPrintNameOrNot() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);

    }
}

