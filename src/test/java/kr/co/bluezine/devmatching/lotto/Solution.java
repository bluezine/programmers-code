package kr.co.bluezine.devmatching.lotto;

import org.junit.Assert;
import org.junit.Test;

import kr.co.bluezine.devmaching.lotto.Lotto;

public class Solution {
	@Test
	public void test() {
		Lotto lotto = new Lotto();
		Assert.assertArrayEquals(lotto.solution(new int[] { 44, 1, 0, 0, 31, 25 }, new int[] { 31, 10, 45, 1, 6, 19 }),
				new int[] { 3, 5 });
		Assert.assertArrayEquals(lotto.solution(new int[] { 0, 0, 0, 0, 0, 0 }, new int[] { 38, 19, 20, 40, 15, 25 }),
				new int[] { 1, 6 });
		Assert.assertArrayEquals(lotto.solution(new int[] { 45, 4, 35, 20, 3, 9 }, new int[] { 20, 9, 3, 45, 4, 35 }),
				new int[] { 1, 1 });
		Assert.assertArrayEquals(lotto.solution(new int[] { 0, 0, 0, 0, 0, 1 }, new int[] { 20, 9, 3, 45, 4, 35 }),
				new int[] { 2, 6 });
		Assert.assertArrayEquals(lotto.solution(new int[] { 7, 8, 9, 10, 11, 12 }, new int[] { 1, 2, 3, 4, 5, 6 }),
				new int[] { 6, 6 });
	}
}