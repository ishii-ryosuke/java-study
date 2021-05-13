package kadai15;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * 【15-5】
 * 100日後の日付をTime APIで言うワニ
 */
public class Main2 {
    public static void main(String[] args) {
        LocalDate future = LocalDate.now().plusDays(100);

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");

        System.out.println(future.format(dateTimeFormat));
    }
}
