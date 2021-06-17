package Java_test.kadai12;

/**
 * 【12-3】
 * Yクラスを継承したAクラス、Bクラスのインスタンスを生み出し、
 * それぞれのb()メソッドを呼び出すMainクラス
 */
public class Main {
    public static void main(String[] args) {
        Y object[] = new Y[2];

        object[0] = new A();
        object[1] = new B();

        for (Y actB : object) {
            actB.b();
        }
    }
}
