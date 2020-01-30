import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean containsVowel = false;

        //using ARRAYLIST
        ArrayList<Character> alphabet = new ArrayList<>();
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> word = new ArrayList<>();

        Collections.addAll(alphabet,'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z');

        Collections.addAll(vowels,'a','e','i','o','u');


        System.out.print("Enter the length of the word: ");
        int length = sc.nextInt();

        for(int i=0; i<length; i++){
            Random rand = new Random();
            int randLetter = rand.nextInt(26);
            word.add(alphabet.get(randLetter));
        }
        System.out.println(word);

        char[] cs = new char[word.size()];
        for(int i=0; i<cs.length; i++){
            cs[i]=word.get(i);
        }
        String output = new String(cs);
        System.out.println(output);

        //check every index of 'word' against every index of 'vowels'
        for(int i=0; i<word.size(); i++){
            for(int j=0; j<vowels.size(); j++){
                if(word.get(i)==vowels.get(j)){
                    containsVowel = true;
                }
            }
        }
        //if(word array contains an element from vowels array) -- ContainsVowels = true -- might be a word
        //if(word array DOESNT contain element from vowels array) -- ContainsVowels = false -- no a word
        if(containsVowel){
            System.out.println("Might be a word");
        }
        else {
            System.out.println("No vowels, not a word");
        }




        //using ARRAY
        //char[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}
    }
}
