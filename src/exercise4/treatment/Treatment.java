package exercise4.treatment;

import java.util.ArrayList;
import java.util.Arrays;

public class Treatment {

    public static boolean isWellFormed (String alphabet, String string) {
        ArrayList<Character> alphabetList = new ArrayList<Character>();
        for(int i=0; i<alphabet.length(); i++) {
            if(alphabet.charAt(i)>='A' && alphabet.charAt(i)<='Z') {
                alphabetList.add(alphabet.charAt(i));
                alphabetList.add(Character.toLowerCase(alphabet.charAt(i)));
            }
            else if(alphabet.charAt(i)>='a' && alphabet.charAt(i)<='z') {
                alphabetList.add(Character.toUpperCase(alphabet.charAt(i)));
                alphabetList.add(alphabet.charAt(i));
            }
            else
                alphabetList.add(alphabet.charAt(i));
        }
        for(int i=0; i<string.length(); i++) {
            /*Character charAux = string.charAt(i);
            if(!alphabetList.contains(charAux))
                return false;
            */
            if(!alphabetList.contains(string.charAt(i)))
                return false;
        }
        return true;
    }

    public static String leftRotate(int nb, String string) {
        StringBuffer result = new StringBuffer("");
        if(string.length()<nb)
            return string;
        for (int i=string.length()-nb; i<string.length(); i++) {
            result.append(string.charAt(i));
        }
        System.out.println(result.toString());
        result.append(String.valueOf(string.subSequence(0,string.length()-nb)));
        return result.toString();
    }

    public static String rightRotate(int nb, String string) {
        StringBuffer result = new StringBuffer("");
        if(string.length()<nb)
            return string;
        result.append(String.valueOf(string.subSequence(string.length()-nb,string.length())));
        for (int i=0;i<string.length()-nb;i++) {
            result.append(string.charAt(i));
        }
        return result.toString();
    }

    public static boolean isAnagram (String str1, String str2) {
        char[] charsTab1 = str1.toCharArray();
        char[] charsTab2 = str2.toCharArray();
        Arrays.sort(charsTab1);
        Arrays.sort(charsTab2);
        return Arrays.equals(charsTab1, charsTab2);
    }

    public static boolean searchAnagram (String string, String[] args) {
        for(String aux : args) {
            if (isAnagram(string, aux)) {
                System.out.println("\t"+aux+" is an anagram of "+string);
                return true;
            }
        }
        return false;
    }

    public static String deleteLettersFromString (String string, String charsToDelete) {
        String res = string;
        for (int i = 0; i < charsToDelete.length(); i++) {
            res = res.replace(String.valueOf(charsToDelete.charAt(i)), "");
        }
        return res;
    }

    public static int countOccurence (String string, String [] stringTab) {
        int counter = 0;
        for(String aux : stringTab) {
            if (aux.equals(string))
                counter++;
        }
        return counter;
    }

}
