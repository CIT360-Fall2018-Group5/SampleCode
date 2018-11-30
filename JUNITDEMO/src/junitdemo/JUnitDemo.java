package junitdemo;

/**
 *
 * * @author Wayne Thomas sandbox code provided by
 * https://www.youtube.com/watch?v=KBx1pWhNUMc&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA
 * https://www.youtube.com/watch?v=FZVjICj_1vE&index=2&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA
 * https://www.youtube.com/watch?v=6RcjjpgOj5c&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA&index=3
 * https://www.youtube.com/watch?v=skF3VZbfVqc&index=4&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA
 * https://www.youtube.com/watch?v=1H73r2RGlNQ&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA&index=5
 * https://www.youtube.com/watch?v=iiroi_RWIpo&list=PL_WCPOWW_gJEJkasFUTZEHSMFKi76_VXA&index=6
 * 
 */
public class JUnitDemo {

    public boolean compareString(String first, String second) {

        if (first.equalsIgnoreCase(second)) {
            return true;
        } else {
            return false;
        }
    }

    public String concatString(String first, String second) {
        return first.concat(second);
    }

    public int[] addOneToArray(int[] numbers) {

        int length = numbers.length;
        int output[] = new int[length];

        for (int i = 0; i < length; i++) {

            output[i] = numbers[i] + 1;
        }
        return output;
    }

    public void performance() {
        for (int i = 0; i < 10000; i++) {
        }
        System.out.println("Finished");
    }

    public void exception(int number) {
        int result = 10 / number;
        System.out.println("Result=> +result");

    }

}
