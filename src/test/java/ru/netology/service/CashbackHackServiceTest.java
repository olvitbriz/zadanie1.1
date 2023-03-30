package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remainIfAmountThousand() {
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount=1000;
        int actual= cashbackHackService.remain(amount);
        int expected=0;
        assertEquals(expected, actual);
    }
    @Test
    void remainIfAmountNineHundred() {
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount=900;
        int actual= cashbackHackService.remain(amount);
        int expected=100;
        assertEquals(expected, actual);
    }
    @Test
    void remainIfAmountThousandAndOneHundred() {
        CashbackHackService cashbackHackService= new CashbackHackService();
        int amount=1100;
        int actual= cashbackHackService.remain(amount);
        int expected=900;
        assertEquals(expected, actual);
    }
}