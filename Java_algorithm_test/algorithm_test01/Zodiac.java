package Java_algorithm_test.algorithm_test01;

public class Zodiac {
    private String[] zodiacList = {"申", "酉", "戌", "亥", "子", "丑", "寅", "卯", "辰", "巳", "午", "未"};
    /**
     * 引数の西暦から干支の名前を求める。
     * @param  year 西暦
     * @return 干支の名前
     */
    public String getNameByYear(int year) {
        return zodiacList[year % 12];
    }
}
