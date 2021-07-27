package kr.co.bluezine.kakao.numberstring;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 2021 카카오 채용연계형 인턴십 > 숫자 문자열과 영단어
 *
 * @author Kisig Ian Seo
 *
 */
public class NumberString {

    // 문자 숫자 간 매핑 정보
    private static Map<String, String> stringToNumber = new HashMap<>();
    static {
        stringToNumber.put("zero", "0");
        stringToNumber.put("one", "1");
        stringToNumber.put("two", "2");
        stringToNumber.put("three", "3");
        stringToNumber.put("four", "4");
        stringToNumber.put("five", "5");
        stringToNumber.put("six", "6");
        stringToNumber.put("seven", "7");
        stringToNumber.put("eight", "8");
        stringToNumber.put("nine", "9");
    }

    public int convert(String s) {
        // 결과값 보관
        StringBuilder result = new StringBuilder();

        // 숫자가 아닐 경우의 문자를 보관할 공간
        StringBuilder tempString = new StringBuilder();

        // 숫자를 판별하기 위한 정규식
        Pattern p = Pattern.compile("[0-9]");
        for (String ss : s.split("")) {
            // 숫자일 경우에 그대로 입력한다.
            if (p.matcher(ss).matches()) {
                result.append(ss);
            } else {
                // 숫자가 아닐 경우에는 일단 임시 공간에 보관 한다.
                tempString.append(ss);
                
                // 임시 공간에 있는 데이터가 매핑 공간에 있는지 확인한다.
                // 매핑 공간에 존재 할 경우 매핑된 숫자를 입력하고 임시 공간을 초기화 해준다.
                if (stringToNumber.containsKey(tempString.toString())) {
                    result.append(stringToNumber.get(tempString.toString()));
                    tempString = new StringBuilder();
                }
            }
        }
        return Integer.parseInt(result.toString());
    }
}
