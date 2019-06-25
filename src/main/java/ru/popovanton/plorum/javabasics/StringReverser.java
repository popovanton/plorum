package ru.popovanton.plorum.javabasics;

public class StringReverser {

    public static String stringReverser(String targetString) {
        char[] chars = targetString.toCharArray();
        StringBuilder sb = new StringBuilder("");
        int charsLength = chars.length-1;
        while (charsLength>=0) {
            sb.append(chars[charsLength--]);
        }
        return sb.toString();
    }
}
