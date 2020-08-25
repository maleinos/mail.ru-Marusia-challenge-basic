import java.util.Scanner;

/**
 *  created by maleinos
 *  email: malevwork@gmail.com
 *  telegram: @princess_theo
 *  date: 16.08.2020
 */

/**
 10
_ _ _ _ _ _ _ _ _ _
_ _ _ _ _ _ _ _ _ _
_ x _ _ _ _ _ 0 0 0
_ 0 _ _ _ _ _ 0 _ _
_ 0 _ _ 0 0 0 0 _ _
_ 0 _ _ 0 _ _ _ _ _
_ 0 _ _ 0 _ _ _ _ _
_ 0 0 0 0 _ _ _ _ _
_ _ _ _ _ _ _ _ _ _
_ _ _ _ _ _ _ _ _ _

5
x _ _ _ 0
0 0 0 0 0
_ _ _ _ _
_ _ _ _ _
_ _ _ _ _

5
x _ _ _ _
0 0 0 0 0
_ _ _ _ 0
_ _ _ _ 0
_ _ _ 0 0

5
_ _ _ _ _
0 _ _ _ _
0 _ _ _ _
0 _ _ _ _
0 0 x _ _

 */

public class task3 {
    public static void main(String[] args) {
        final char START = 'x';
        final char WAY = '.';
        final char STOP = '_';

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] table = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = scanner.next().charAt(0);
            }
        }

        int count = 0;
        for (char[] chars : table) {
            for (char aChar : chars) {
                if (aChar == WAY)
                    count++;
            }
        }
        int k = 0;
        for (int cou = 0; cou < count; cou++) {
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[i].length; j++) {
                    if (k < count)
                    if (table[i][j] == START) {
                        table[i][j] = STOP;

                        if (i + 1 < n && table[i + 1][j] == WAY ) {
                            table[i + 1][j] = START;
                            System.out.println("Вниз!");
                            k++;
                            break;
                        }

                        if (j + 1 < n && table[i][j + 1] == WAY) {
                            table[i][j + 1] = START;
                            System.out.println("Направо!");
                            k++;
                            break;
                        }

                        if (table[i - 1][j] == WAY) {
                            table[i - 1][j] = START;
                            System.out.println("Наверх!");
                            k++;
                            break;
                        }

                        if (table[i][j - 1] == WAY) {
                            table[i][j - 1] = START;
                            System.out.println("Налево!");
                            k++;
                            break;
                        }
                    }
                }
            }
        }
    }
}
