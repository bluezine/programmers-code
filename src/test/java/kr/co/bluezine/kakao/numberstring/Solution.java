package kr.co.bluezine.kakao.numberstring;

import org.junit.Assert;
import org.junit.Test;

public class Solution {

    @Test
    public void test() {
        NumberString numberString = new NumberString();

        Assert.assertEquals(1478, numberString.convert("one4seveneight"));
        Assert.assertEquals(234567, numberString.convert("23four5six7"));
        Assert.assertEquals(10203, numberString.convert("1zerotwozero3"));
        Assert.assertEquals(234567, numberString.convert("2three45sixseven"));
        Assert.assertEquals(123, numberString.convert("123"));
        Assert.assertEquals(123, numberString.convert("onetwothree"));

    }
}
