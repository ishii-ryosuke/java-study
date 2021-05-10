package kadai15;

/**
 * 【15-1】
 * 文字列を連結したり分割したりするプログラム
 */
public class Test15_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < 100 ; i++) {
            sb.append(i+1);
            sb.append(",");
        }

        String s = sb.toString();

        System.out.println(s);

        String[] a = s.split(",");

        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(a[i]);
        }
    }
}
