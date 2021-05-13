package kadai15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 【15-4】
 * 100日後の日付言うワニ
 */
public class Main {
    public static void main(String[] args) {
        Date today = new Date();
        // System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        day += 100;
        calendar.set(Calendar.DAY_OF_MONTH, day);

        today = calendar.getTime();
        // System.out.println(date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(dateFormat.format(today));
    }
}
