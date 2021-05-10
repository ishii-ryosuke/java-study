package kadai15;

/**
 * 【15-2】
 * 完全なファイル名を作成するメソッド
 */
public class Test15_2 {
    public static void main(String[] args) {
        String file1 = "readme.txt";
        String folder1 = "c:¥javadev¥";

        System.out.println(fileNameMaker(file1, folder1));

        String file2 = "readme.txt";
        String folder2 = "c:¥javadev";

        System.out.println(fileNameMaker(file2, folder2));
    }

    public static String fileNameMaker(String file, String folder) {
        StringBuilder sb = new StringBuilder();
        sb.append(folder);

        if (!folder.endsWith("¥")) {
            sb.append("¥");
        }

        sb.append(file);

        return sb.toString();
    }
}
