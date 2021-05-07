package kadai13;

/**
 * 【13-1~13-4】
 * カプセル化を意識した杖のクラス
 */
public class Wand {
    private String name;
    private double power;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("名前が短いです。処理を中断します。");
        }
        this.name = name;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100) {
            throw new IllegalArgumentException("杖の増幅率が範囲外です。処理を中断します。");
        }
        this.power = power;
    }
}
