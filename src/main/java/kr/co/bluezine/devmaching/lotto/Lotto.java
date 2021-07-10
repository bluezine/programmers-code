package kr.co.bluezine.devmaching.lotto;

/**
 * 2021 Dev-Matching: 웹 백엔드 개발자(상반기) - 로또의 최고 순위와 최저 순위
 * 
 * @author Kisig Ian Seo
 *
 */
public class Lotto {
	public int[] solution(int[] lottos, int[] win_nums) {
		int ranNum = 0;
		int count = 0;
		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0)
				ranNum++;
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j])
					count++;
			}
		}

		int max = 7 - count - ranNum;
		int min = 7 - count;

		return new int[] { max > 6 ? 6 : max, min > 6 ? 6 : min };
	}
}
