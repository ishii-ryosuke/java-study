package Java_test.kadai13;

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard();

        wizard.setHp(100);
        System.out.println(wizard.getHp());

        wizard.setHp(-100);
        System.out.println(wizard.getHp());

        wizard.setMp(10);
        System.out.println(wizard.getMp());

        // wizard.setMp(-100);
        System.out.println(wizard.getMp());

        wizard.setName("魔法使い");
        System.out.println(wizard.getName());

        // wizard.setName("魔");
        System.out.println(wizard.getName());

        Wand wand = new Wand();

        wand.setName("魔法の杖");
        System.out.println(wand.getName());

        // wand.setName("杖");
        System.out.println(wand.getName());

        wand.setPower(50);
        System.out.println(wand.getPower());

        // wand.setPower(0);
        System.out.println(wand.getPower());

        wizard.setWand(wand);
        System.out.println(wizard.getWand().getName());

        Wand wandnull = null;

        // wizard.setWand(wandnull);
        System.out.println(wizard.getWand().getName());

        Hero hero = new Hero();
        hero.setHp(70);
        hero.setName("勇者");

        wizard.heal(hero);
        System.out.println(hero.getHp());
    }
}
