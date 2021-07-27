package kr.co.bluezine.summerwinter.decimalcount;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    @Test
    public void test() {
        DecimalCount decimalCount = new DecimalCount();
        Assert.assertEquals(1, decimalCount.decimalCount(new int[] {1,2,3,4}));
        Assert.assertEquals(4, decimalCount.decimalCount(new int[] {1,2,7,6,4}));
    }
}
