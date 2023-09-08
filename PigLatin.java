import java.util.Scanner;

public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Original:");
        String phrase = input.nextLine();
        String word;
        String chara; // for testing if the beginning of a word is the vowel
        int len = phrase.length();
        int start = 0; // initializes it so that start is the beginning of the string
        
        for (int i = 0; i < len; i++)
        {   
            chara = phrase.substring(i, i + 1);
            System.out.println(chara);

            if (chara.equalsIgnoreCase(" ")) //finds end of a word
            {
                System.out.println("space found");
                word = phrase.substring(start, i); //since substring does not include end character, space is not included
                chara = phrase.substring(start, start + 1);
            }
            else
            {
                System.out.println("no space found");
            }
        
            if (chara.equalsIgnoreCase("a") || chara.equalsIgnoreCase("e") || chara.equalsIgnoreCase("i") || chara.equalsIgnoreCase("o")|| chara.equalsIgnoreCase("u"))
            {
                System.out.println("vowel found");
                phrase = phrase.substring(0, i) + "way" + phrase.substring(i, len + 3);
                len = phrase.length(); //updates phrase length
            }
            else
            {
                System.out.println("no vowel found");
            }
            start = i + 1; //updates the next starting position fo word

            System.out.println("for loop running " + i);
        }

        System.out.println(phrase);
    }
}