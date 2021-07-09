package kr.co.bluezine.kakao.idrecommend;

/**
 * 2021 KAKAO BLIND RECRUITMENT > 신규 아이디 추천
 * 
 * @author Kisig Ian Seo
 *
 */
public class IdRecommend {
	public String solution(String new_id) {
		String input = new_id;
		// 1단계
		input = input.toLowerCase();
		// 2단계
		input = input.replaceAll("[^a-z0-9\\.\\-\\_]", "");
		// 3단계
		input = input.replaceAll("\\.{2,}", ".");
		// 4단계
		input = input.replaceAll("^\\.", "");
		input = input.replaceAll("\\.$", "");
		// 5단계
		if (input.length() == 0)
			input = "a";
		// 6단계
		if (input.length() >= 16) {
			input = input.substring(0, 15);
			input = input.replaceAll("\\.$", "");
		}
		// 7단계
		if (input.length() <= 2) {
			String lastChar = input.substring(input.length() - 1);
			while (true) {
				input += lastChar;
				if (input.length() >= 3)
					break;
			}
		}
		return input;
	}
}
