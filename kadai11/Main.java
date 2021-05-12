package kadai11;

public class Main {
    public static void main(String[] args) {
        Book javaStudy = new Book("Java入門", 5000, "緑", "7777777");

        System.out.println(javaStudy.getName());
        System.out.println(javaStudy.getPrice());
        System.out.println(javaStudy.getColor());
        System.out.println(javaStudy.getIsbn());

        javaStudy.setWeight(300.0);
        System.out.println(javaStudy.getWeight());

        Computer mac = new Computer("石井のmac", 100000, "シルバー", "Apple");

        System.out.println(mac.getName());
        System.out.println(mac.getPrice());
        System.out.println(mac.getColor());
        System.out.println(mac.getMakerName());

        mac.setWeight(700.0);
        System.out.println(mac.getWeight());
    }
}
