package com.learning.Number50;


/**
 * @Author xuetao
 * @Description: 编写一个程序，通过已填充的空格来解决数独问题。
 * <p>
 * 一个数独的解法需 遵循如下规则 ：
 * <p>
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 * 空白格用 '.' 表示。
 * <p>
 * <p>
 * <p>
 * 一个数独。
 * <p>
 * <p>
 * <p>
 * 答案被标成红色。
 * <p>
 * Note:
 * <p>
 * 给定的数独序列只包含数字 1-9 和字符 '.' 。
 * 你可以假设给定的数独只有唯一解。
 * 给定数独永远是 9x9 形式的。
 * @Date 2019-06-12
 * @Version 1.0
 */
public class LeetCode37 {

    public static void main(String[] args) {
        char array[][] = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        sloveValidSudoku(array);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean sloveValidSudoku(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(array, i, j, c)) {
                            array[i][j] = c;
                            System.out.println(i + "" + j + "" + c);
                            if (sloveValidSudoku(array)) {
                                return true;
                            } else {
                                array[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isValid(char[][] array, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (array[i][col] != '.' && array[i][col] == c) {
                return false;
            }
            if (array[row][i] != '.' && array[row][i] == c) {
                return false;
            }
            if (array[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.'
                    && array[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
                return false;
            }
        }
        return true;
    }

//    public static boolean sloveValidSudoku(String[][] array) {
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                String str = array[i][j];
//                if ('.'.equals(str)) {
//                    for (int m = 0; m < 9; m++) {
//                        if (isValid(array, i, j, String.valueOf(m))) {
//                            array[i][j] = String.valueOf(m);
//
//                            if (sloveValidSudoku(array)) {
//                                return true;
//                            } else {
//                                array[i][j] = '.';
//                            }
//                        }
//                    }
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    /**
//     * 判断行，列，块是否有重复的数据
//     *
//     * @param array
//     * @param row
//     * @param col
//     * @param c
//     * @return
//     */
//    private static boolean isValid(String[][] array, int row, int col, String c) {
//        for (int i = 0; i < 9; i++) {
//            if (array[i][col] != '.' && array[i][col] == c) {
//                return false;
//            }
//
//            if (array[row][i] != '.' && array[row][i] == c) {
//                return false;
//            }
//
//            int x = 3 * (row / 3) + i / 3;
//            int y = 3 * (col / 3) + i % 3;
//            if (array[x][y] != '.' && array[x][y] == c) {
//                return false;
//            }
//        }
//        return true;
//    }

}
