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
                
            
                if (chara.equalsIgnoreCase("a") || chara.equalsIgnoreCase("e") || chara.equalsIgnoreCase("i") || chara.equalsIgnoreCase("o")|| chara.equalsIgnoreCase("u"))
                {
                    System.out.println("vowel found " + chara);
                    phrase = phrase + "way";
                    len = phrase.length();
                    start = i + 1 + 3; //updates the next starting position fo word
                }
                else
                {
                    System.out.println("no vowel found");
                }
            
            }
            else
            {
                System.out.println("no space found");
            }
            System.out.println("for loop running " + i);
        }

        System.out.println(phrase);
    }
}