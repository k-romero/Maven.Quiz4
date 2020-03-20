package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String result = "";
        Character resultChar = Character.toUpperCase(getMiddleCharacter(str));
        for (int i = 0; i < str.length(); i++) {
            if(i == str.length()/2){
                result += resultChar;
            }else
            result += str.charAt(i);
        }
        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String result = "";
        Character resultChar = Character.toLowerCase(getMiddleCharacter(str));
        for (int i = 0; i < str.length(); i++) {
            if(i == str.length()/2){
                result += resultChar;
            }else
                result += str.charAt(i);
        }
        return result;
    }

    public static Boolean isIsogram(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        ArrayList<Character> dups = new ArrayList<>();
        String result = "";
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)){
                dups.add(str.charAt(i));
            }
        }
        for (int i = 0; i < str.length()-1; i++) {
            if(!dups.contains(str.charAt(i))){
                result += str.charAt(i);
            }
        }
        result += str.charAt(str.length()-1);
        return result;
    }

    public static String invertCasing(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(Character.isAlphabetic(arr[i])){
                if(Character.isLowerCase(arr[i])){
                   arr[i] = Character.toUpperCase(arr[i]);
                } else {
                    arr[i] = Character.toLowerCase(arr[i]);
                }
            }
        }
        String result = "";
        for (char c : arr) {
            result+=c;
        }
        return result;
    }
}