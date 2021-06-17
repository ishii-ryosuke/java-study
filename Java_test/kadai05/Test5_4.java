package Java_test.kadai05;

/**
 * 【5-4】
 * メソッド「calcTriangleArea」、メソッド「calcCircleArea」
 */
public class Test5_4 {
    public static void main(String[] args) {
        System.out.println("三角形の底辺の長さが10.0cm、高さが5.0cmの場合、面積は"
                + calcTriangleArea(10.0, 5.0) + "cm^2");

        System.out.println("円の半径が5.0cmの場合、面積は"
                + calcCircleArea(5.0) + "cm^2");
    }

    public static double calcTriangleArea(double bottom, double height) {
        return bottom * height / 2.0;
    }

    public static double calcCircleArea(double radius) {
        return radius * radius * 3.14;
    }
}
