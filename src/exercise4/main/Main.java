package exercise4.main;

import exercise4.treatment.Treatment;

import java.util.Arrays;

public class Main {

    public static void main (String[] args) {
        System.out.println(Treatment.leftRotate(3,"abcdefghi"));
        System.out.println(Treatment.rightRotate(3,"abcdefghi"));
        if(!Treatment.isWellFormed(args[0], args[1]))
            System.out.println("Error : " + args[1] + " is not composed by alphabet "+args[0]);
        else {
            //args[1] = Treatment.leftRotate(3,args[1]);
            //args[1] = Treatment.rightRotate(3,args[1]);
            for(int i=0; i<args.length; i++) {
                if (args[i].equals("/a")) {
                    System.out.println("Searching for an anagram of : " + args[i - 1]);
                    System.out.println("\t" + Treatment.searchAnagram(args[i - 1], Arrays.copyOfRange(args, i + 1, args.length)));
                }
                else if (args[i].equals("/o")) {
                    for(int j=i+1; j<args.length; j++) {
                        System.out.println("Deleting characters from "+ args[j] + " in "+args[i-1]);
                        args[i-1] = Treatment.deleteLettersFromString(args[i-1],args[j]);
                        System.out.println("Here is your new string : "+ args[i-1]);
                    }
                }
                else if (args[i].equals("/f")) {
                    System.out.println("Occurence of "+args[i-1]+" = "+Treatment.countOccurence(args[i-1], Arrays.copyOfRange(args, i + 1, args.length)));
                }
            }
        }
    }

}
