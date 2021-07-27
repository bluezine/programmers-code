package kr.co.bluezine.summerwinter.decimalcount;

/**
 * Summer/Winter Coding(~2018) > 소수 만들기
 *
 * @author Kisig Ian Seo
 *
 */
public class DecimalCount {
    public int decimalCount(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int z = j + 1; z < nums.length; z++) {
                    if (isDecimal(nums[i] + nums[j] + nums[z]))
                        count++;
                }
            }
        }
        return count;
    }

    /**
     * 소수 여부를 확인한다.
    **/
    private boolean isDecimal(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;

            if (count > 2)
                return false;
        }
        return true;
    }
}
