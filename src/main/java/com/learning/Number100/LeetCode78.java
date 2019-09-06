package com.learning.Number100;

/**
 * @Author xuetao
 * @Description: 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 * <p>
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 * <p>
 * 示例:
 * <p>
 * board =
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * <p>
 * 给定 word = "ABCCED", 返回 true.
 * 给定 word = "SEE", 返回 true.
 * 给定 word = "ABCB", 返回 false.
 * @Date 2019-08-04
 * @Version 1.0
 */
public class LeetCode78 {
    public static void main(String[] args) {
        char [][] chars = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String target = "SEE";
        System.out.println(exist(chars, target));
    }

    private static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, visited, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final int[] dirs = new int[]{0, 1, 0, -1, 0};

    private static boolean dfs(char[][] board, boolean[][] visited, int row, int col, String word, int index) {
        if (index >= word.length() || word.charAt(index) != board[row][col]) {
            return false;
        } else if (index == word.length() - 1 && word.charAt(index) == board[row][col]) {
            visited[row][col] = true;
            return true;
        }
        //set it to true for this case
        visited[row][col] = true;
        boolean result = false;
        for (int i = 0; i < 4; i++) {
            int nextRow = row + dirs[i];
            int nextCol = col + dirs[i + 1];
            if (nextRow < 0 || nextRow >= board.length || nextCol < 0 || nextCol >= board[0].length || visited[nextRow][nextCol]) {
                continue;
            }
            result = dfs(board, visited, nextRow, nextCol, word, index + 1);
            if (result) {
                return result;
            } else {
                //set it back to false if this road doesn't work to allow it for other paths, this is backtracking!!!
                visited[nextRow][nextCol] = false;
            }
        }
        return result;
    }

}
