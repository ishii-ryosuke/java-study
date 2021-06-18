package Java_algorithm_test.algorithm_test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * [アルゴリズム課題3]
 * 整数を 10 回入力し、小さい順に並べ替えて表示するプログラムを作成してください。
 * 整数ではない値が入力された場合は例外を投げて処理を中断し、下記のメッセージをコンソールに表示してください。
 * 表示するメッセージ：不正な値が入力されたため処理を中断しました。値は整数で入力してください。
 */
public class Sort {
    public static void execute(int[] numbers) {
        // バブルソートで並び替え
        for (int i = 0; i < numbers.length; i++) {
            if (!numberSwapped(numbers, i)) {
                break;
            }
        }
    }

    public static boolean numberSwapped(int[] numbers, int index) {
        boolean swappedFlag = false;
        for (int j = 0; j < numbers.length - index - 1; j++) {
            if (numbers[j] > numbers[j + 1]) {
                int temp = numbers[j];
                numbers[j] = numbers[j + 1];
                numbers[j + 1] = temp;
                swappedFlag = true;
            }
        }
        return swappedFlag;
    }

    public static boolean numberListCheck(String numberString) {
        if (numberString.indexOf(",") != -1) {
            return true;
        }
        return false;
    }

    public static void changeStringListToIntegerList(String numberString, int[] inputNumbers) {
        String[] numberStringList = numberString.split(",");
        for (int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = Integer.parseInt(numberStringList[i]);
        }
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int[] inputNumbers = new int[10];
            for (int index = 0; index < inputNumbers.length; index++) {
                // 10回入力を受け付ける
                String str = reader.readLine().trim();
                if (numberListCheck(str)) {
                    changeStringListToIntegerList(str, inputNumbers);
                    break;
                }
                inputNumbers[index] = Integer.parseInt(str);
            }
            // ソートを実行する
            execute(inputNumbers);
            // 結果を出力する
            System.out.print(Arrays.toString(inputNumbers));
        } catch (NumberFormatException numFormatException) {
            System.out.println("不正な値が入力されたため処理を中断しました。値は整数で入力してください。");
        } catch (IOException e) {
            System.out.println("入力エラー：" + e.getMessage());
        }
    }
}
