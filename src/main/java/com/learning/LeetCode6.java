package com.learning;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：
 * <p>
 * P A H N
 * A P L S I I G
 * Y I R
 * <p>
 * 之后从左往右，逐行读取字符： "PAHNAPLSIIGYIR"
 * <p>
 * 实现一个将字符串进行指定行数变换的函数:
 * <p>
 * string convert(string s, int numRows);
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "PAYPALISHIRING", numRows = 3
 * 输出: "PAHNAPLSIIGYIR"
 * <p>
 * 示例 2:
 * <p>
 * 输入: s = "PAYPALISHIRING", numRows = 4
 * 输出: "PINALSIGYAHRPI"
 * 解释:
 * <p>
 * P I N
 * A L S I G
 * Y A H R
 * P I
 * @Date 2019-04-27
 * @Version 1.0
 */
public class LeetCode6 {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        System.out.println(convert(str, 3));
    }

    /**
     * z字形变换即 numRows 从 0 ~ numRows - 1 然后更换状态 numRows - 1 ~ 0 。
     * @param s
     * @param numRows
     * @return
     */
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuffer stringBuffer = new StringBuffer();
        List<StringBuffer> list = new ArrayList<StringBuffer>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuffer());
        }
        int rowNum = 0;
        boolean flag = false;
        for (char ch : s.toCharArray()) {
            list.get(rowNum).append(ch);

            if (rowNum == 0 || rowNum == numRows - 1) {
                flag = !flag;
            }
            rowNum += flag ? 1 : -1;
        }
        for (int j = 0; j < numRows; j++) {
            stringBuffer.append(list.get(j).toString());
        }

        return stringBuffer.toString();

    }
}
