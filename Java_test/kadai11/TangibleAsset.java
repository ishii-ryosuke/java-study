package Java_test.kadai11;

/**
 * 【11-1~11-4】
 * 有形資産を管理する場合に有用な抽象クラス、TangibleAssetクラス
 */
public abstract class TangibleAsset extends Asset implements Thing {
    String color;
    double weight;

    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
