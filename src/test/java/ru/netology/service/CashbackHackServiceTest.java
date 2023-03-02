package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        // Test case where amount is less than boundary
        int amount1 = 500;
        int expected1 = 500;
        int actual1 = service.remain(amount1);
        Assert.assertEquals( expected1,actual1);

        // Test case where amount is equal to boundary
        int amount2 = 1000;
        int expected2 = 0;
        int actual2 = service.remain(amount2);
        Assert.assertEquals( expected2,actual2);

        // Test case where amount is greater than boundary
        int amount3 = 1500;
        int expected3 = 500;
        int actual3 = service.remain(amount3);
        Assert.assertEquals(expected3,actual3);
    }
}

