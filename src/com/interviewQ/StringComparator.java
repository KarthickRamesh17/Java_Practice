package com.interviewQ;

public class StringComparator {
    static boolean areStringsEqual(String str1, String str2)
    {
        String clearedStrings1 = str1.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String clearedStrings2 = str2.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        return clearedStrings1.equals(clearedStrings2);
    }
    public static void main(String[] args) {
        String str1 = "N..r..t*o";
        String str2 = "n**o..r...t";
        System.out.println(areStringsEqual(str1,str2));

        str1 = "di..g*i..t#a..L";
        str2 = "D&i..G**i**t..a..l";
        System.out.println(areStringsEqual(str1, str2)); // Output: true

    }
}
