package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        // Test case where amount is less than boundary
        int amount1 = 500;
        int expected1 = 500;
        int actual1 = service.remain(amount1);
        Assert.assertEquals(actual1, expected1);

        // Test case where amount is equal to boundary
        int amount2 = 1000;
        int expected2 = 0;
        int actual2 = service.remain(amount2);
        Assert.assertEquals(actual2, expected2);

        // Test case where amount is greater than boundary
        int amount3 = 1500;
        int expected3 = 500;
        int actual3 = service.remain(amount3);
        Assert.assertEquals(actual3, expected3);
    }
}

