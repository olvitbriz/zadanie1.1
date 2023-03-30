package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remainIfAmountThousand() {
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount=1000;
        int actual= cashbackHackService.remain(amount);
        int expected=0;
        assertEquals(actual,expected);
    }
    @Test
    public void remainIfAmountNineHundred() {
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount=900;
        int actual= cashbackHackService.remain(amount);
        int expected=100;
        assertEquals(actual,expected);
    }
    @Test
    public void remainIfAmountThousandAndOneHundred() {
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount=1100;
        int actual= cashbackHackService.remain(amount);
        int expected=900;
        assertEquals(actual,expected);
    }
}