import java.util.Scanner;

public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Original:");
        String phrase = input.nextLine();

        int len = phrase.length();
        int start = 0;
        String chara;
        int cycle; // intended to cycle through consonants until it reaches a value;

        for (int i = 0; i < len; i++)
        {
            if (phrase.substring(i, i + 1) == " "); // up to but not including. phrase[i] is a space
            {   
                chara = phrase.substring(start, start + 1);

                if (chara == "a" || chara == "e" || chara == "i" || chara == "o" || chara == "u") // add way if word starts with a vowel
                {
                    phrase = phrase.substring(0, i) + "way" + phrase.substring(i, len);
                }
                else
                {   
                    cycle = start + 1; // starts on the 2nd letter of a word
                    while (!(chara == "a" || chara == "e" || chara == "i" || chara == "o" || chara == "u"))
                    {
                        chara = phrase.substring(cycle, cycle + 1); 
                        cycle += 1;
                    }

                    phrase = phrase.substring(0 , start) + phrase.substring(cycle - 1, cycle) + phrase.substring(start, cycle - 1) + "ay" + phrase.substring(i, len);
                }
                start = i + 1;
            }
        }

    }
}