package Java_test.kadai11;

/**
 * 【11-2】
 * 資産を管理する抽象クラス、Assetクラス
 */
public abstract class Asset {
    String name;
    int price;

    public Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
