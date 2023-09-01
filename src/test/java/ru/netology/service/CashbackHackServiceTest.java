package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void amountIsLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void amountIsEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 1000;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void amountIsGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int expected = 800;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}
