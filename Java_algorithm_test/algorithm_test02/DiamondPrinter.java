package Java_algorithm_test.algorithm_test02;

/**
 * [アルゴリズム課題2]
 * コンソールにひし形を描画してください。
 * <前提条件>
 * メソッドは下記の通りに実装してください。
 * ・メソッドの引数にint型の数値を渡すようにしてください。
 * ・ひし形の高さは引数で渡す数値によって変動するようにしてください。
 */
public class DiamondPrinter {

    /**
     * 指定されたスペース数とドット数の文字列を返す.
     *
     * @param space スペース数
     * @param dot   ドット数
     * @return 指定されたスペース数とドット数の文字列
     */
    private StringBuilder createLine(int space, int dot) {
        StringBuilder spaceString = new StringBuilder();
        for (int i = 0; i < space; i++) {
            spaceString.append(" ");
        }
        StringBuilder dotString = new StringBuilder();
        for (int i = 0; i < dot; i++) {
            dotString.append("*");
        }
        StringBuilder diamondLine = new StringBuilder();
        diamondLine.append(spaceString);
        diamondLine.append(dotString);
        diamondLine.append(spaceString);
        diamondLine.append("\n");
        return diamondLine;
    }

    /**
     * 指定の高さのひし形を文字列で返す.
     *
     * @param height 高さ
     * @return 指定の高さのひし形の文字列
     */
    private StringBuilder createDiamond(int height) {
        StringBuilder diamondString = new StringBuilder();
        int diamondWidth = 0;
        for (; diamondWidth < height; diamondWidth++) {
            int dot = 2 * diamondWidth + 1;
            int space = ((2 * height - 1) - dot) / 2;
            diamondString.append(createLine(space, dot));
        }
        diamondWidth--;
        for (; diamondWidth != 0; diamondWidth--) {
            int dot = 2 * diamondWidth - 1;
            int space = ((2 * height - 1) - dot) / 2;
            diamondString.append(createLine(space, dot));
        }
        return diamondString;
    }

    public static void main(String[] args) {
        DiamondPrinter diamondPrinter = new DiamondPrinter();
        // 引数の数値が1の場合
        System.out.print(diamondPrinter.createDiamond(1));
        System.out.print("\n");

        // 引数の数値が2の場合
        System.out.print(diamondPrinter.createDiamond(2));
        System.out.print("\n");

        // 引数の数値が3の場合
        System.out.print(diamondPrinter.createDiamond(3));
    }
}
