package Java_test.kadai11;

/**
 * 【11-1】
 * コンピュータのクラス、Computerクラス
 */
public class Computer extends TangibleAsset {
    String makerName;

    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }

    public String getMakerName() {
        return this.makerName;
    }
}
