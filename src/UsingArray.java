import java.util.Random;
import java.util.Scanner;

public class UsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean containsVowel = false;

        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l',
                'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        char[] vowels = {'a','e','i','o','u'};

        for(Character c : alphabet){
            System.out.print(c+" ");
        }
        System.out.println();
        for(Character c : vowels){
            System.out.print(c+" ");
        }

        System.out.println();
        System.out.print("Enter a length for the word: ");
        int length = sc.nextInt();
        char[] word = new char[length];

        for(int i=0; i<length; i++){
            Random rand = new Random();
            int randNum = rand.nextInt(26);
            word[i]=alphabet[randNum];
        }

        for (char c : word){
            System.out.print(c);
        }
        System.out.println();


        for(int i=0; i<word.length; i++) {
            for (int j = 0; j<vowels.length; j++) {
                if (word[i] == vowels[j]) {
                    containsVowel = true;
                }
            }
        }

        if(containsVowel){
            System.out.println("Might be a word");
        }
        else {
            System.out.println("No vowels, not a word");
        }

    }
}
