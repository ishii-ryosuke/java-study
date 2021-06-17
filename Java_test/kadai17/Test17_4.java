package Java_test.kadai17;

import java.io.IOException;

/**
 * 【17-4】
 * 起動直後にIOExceptionを送出して異常終了するプログラム
 */
public class Test17_4 {
    public static void main(String[] args) throws IOException {
        System.out.println("プログラムが起動しました");
        throw new IOException();
    }
}
