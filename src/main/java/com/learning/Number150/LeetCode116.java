package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 比较两个版本号 version1 和 version2 。
 * 如果 _version1_ > _version2_ 返回 1 ，如果 _version1_ < _version2_ 返回 -1 ， 除此之外返回 0 。
 * <p>
 * 你可以假设版本字符串非空，并且只包含数字和 . 字符。
 * <p>
 * . 字符不代表小数点，而是用于分隔数字序列。
 * <p>
 * 例如， 2.5 不是“两个半”，也不是“差一半到三”，而是第二版中的第五个小版本。
 * <p>
 * 示例 1:
 * <p>
 * 输入: _version1_ = "0.1", _version2_ = "1.1"
 * 输出: -1
 * <p>
 * 示例 2:
 * <p>
 * 输入: _version1_ = "1.0.1", _version2_ = "1"
 * 输出: 1
 * <p>
 * 示例 3:
 * <p>
 * 输入: _version1_ = "7.5.2.4", _version2_ = "7.5.3"
 * 输出: -1
 * @Date 2019-09-17
 * @Version 1.0
 */
public class LeetCode116 {
    public static void main(String[] args) {
        String target = "7.5.2";
        String source = "7.5.2.4.6";
        System.out.println(compareVersion(target, source));
    }


    private static int compareVersion(String target, String source) {

        String[] targetArray = target.split("\\.");
        String[] sourceArray = source.split("\\.");
        int targetLen = targetArray.length;
        int sourceLen = sourceArray.length;
        int min = Math.min(targetLen, sourceLen);
        for (int i = 0; i < min; i++) {
            if (Integer.valueOf(targetArray[i]) < Integer.valueOf(sourceArray[i])) {
                return -1;
            }

            if (Integer.valueOf(targetArray[i]) > Integer.valueOf(sourceArray[i])) {
                return 1;
            }
        }
        if (targetLen == sourceLen) {
            return 0;
        }
        return targetLen > sourceLen ? 1 : -1;

    }
}
