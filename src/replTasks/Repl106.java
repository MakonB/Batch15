package replTasks;

import java.util.Scanner;

public class Repl106 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        String vowels = "";
        for (int i = 0; i < word.length() ; i++) {

            if ( word.charAt(i)=='a'|| word.charAt(i)=='o'|| word.charAt(i)=='u' || word.charAt(i)=='e'||word.charAt(i)=='i'  ){

                vowels = vowels + word.charAt(i);
            }
            }
        System.out.println(vowels);
        }

    }

