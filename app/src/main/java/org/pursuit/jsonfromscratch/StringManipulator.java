package org.pursuit.jsonfromscratch;

public class StringManipulator {

    private static StringManipulator stringManipulator;

    private static StringManipulator getInstance(){
        if(stringManipulator==null) stringManipulator = new StringManipulator();
        return stringManipulator;
    }
    private StringManipulator(){}

    public boolean isLessThan10(String str){
        if (str.length() <= 9){
            return true;
        }
        return false;
    }
    public boolean isOddLength(String str){
        if(str.length() % 2 == 1){
            return true;
        }
        return false;
    }
    public String zipperWords(String str1, String str2){

    }
}


