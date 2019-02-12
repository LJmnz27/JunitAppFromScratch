package org.pursuit.jsonfromscratch;

public class StringManipulator {

    private static StringManipulator stringManipulator;

    private static StringManipulator getInstance() {
        if (stringManipulator == null) stringManipulator = new StringManipulator();
        return stringManipulator;
    }

    private StringManipulator() {
    }

    public boolean isLessThan10(String str) {

        try {
            if (str.length() < 9) {
                return true;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isOddLength(String str) {
        if (str.length() % 2 == 1) {
            return true;
        }
        return false;
    }

    public String zipperWords(String first, String second) {

        String newString = "";
        int i = 0;
        while (i < first.length() && i < second.length()) {
            newString += first.charAt(i) + "" + second.charAt(i);
            i++;
        }
        while (i < first.length()) {
            newString += first.charAt(i);
            i++;
        }
        while (i < second.length()) {
            newString += second.charAt(i);
            i++;
        }
        return newString;
    }



}



