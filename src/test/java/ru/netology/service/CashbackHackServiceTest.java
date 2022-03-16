package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAmountZero () {

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountEqualsBoundary () {

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountMin () {

        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountMax () {

        int amount = 1002;
        int actual = service.remain(amount);
        int expected = 998;

        assertEquals(expected, actual);
    }

}