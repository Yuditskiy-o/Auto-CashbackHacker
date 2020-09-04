package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceJUnitJupiterTest {

    @Test
    public void shouldReturn1000WhenAmountIsZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainIfAmountIsLessBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainIfAmountIsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainIfAmountIsMoreBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateRemainIfAmountIsLessZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = -1;

        int actual = service.remain(amount);
        int expected = 1001;

        assertEquals(expected, actual);
    }
}
