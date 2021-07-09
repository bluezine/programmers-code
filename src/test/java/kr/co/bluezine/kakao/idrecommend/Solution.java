package kr.co.bluezine.kakao.idrecommend;

import org.junit.Assert;
import org.junit.Test;

public class Solution {
	@Test
	public void test() {
		IdRecommend idRecommend = new IdRecommend();
		Assert.assertEquals(idRecommend.solution("...!@BaT#*..y.abcdefghijklm"), "bat.y.abcdefghi");
		Assert.assertEquals(idRecommend.solution("z-+.^."), "z--");
		Assert.assertEquals(idRecommend.solution("=.="), "aaa");
		Assert.assertEquals(idRecommend.solution("123_.def"), "123_.def");
		Assert.assertEquals(idRecommend.solution("abcdefghijklmn.p"), "abcdefghijklmn");
	}
}