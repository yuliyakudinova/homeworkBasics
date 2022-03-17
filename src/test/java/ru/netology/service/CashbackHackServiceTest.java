package ru.netology.service;


import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAmountZero () {

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldAmountEqualsBoundary () {

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldAmountMin () {

        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldAmountMax () {

        int amount = 1002;
        int actual = service.remain(amount);
        int expected = 998;

        Assert.assertEquals(expected,actual);
    }

}