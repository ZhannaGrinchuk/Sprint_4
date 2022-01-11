package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTestCaseWithNull {

        @Test(expected = NullPointerException.class)
        public void nullReturnFalse(){
            Account account = new Account(null);
            assertFalse(account.checkNameToEmboss());
        }

    }

