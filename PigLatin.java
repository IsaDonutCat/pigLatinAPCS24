import java.util.Scanner;
import java.util.ArrayList;

public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Original:");

        String origin = input.nextLine(); //gets input
        char[] phrase = origin.toCharArray();
        ArrayList<String> wordsList = new ArrayList<String>(); //intializes an arraylist,which is a like a dynamic memory from c
        int len = origin.length(); //gets len to run through and find spaces
        
        int spaceCount = 0; //finds spaces to make sure it's the first space so words can be accurately stored
        int previouSpace = 0;;  //stores prev space to make sure that the words are correctly stored

        for (int i = 0; i < len; i++)
        {
            if (phrase[i] == ' ')
            {
                spaceCount++;
                if (spaceCount == 1)
                {
                    previouSpace = i;
                    wordsList.add(origin.substring(0, i));
                }
                else
                {
                    wordsList.add(origin.substring(previouSpace + 1, i));
                    previouSpace = i;
                }
            }  

            if (i == len - 1)
            {
                //System.out.println("last end reached fo string");
                if (spaceCount == 0)
                {
                    wordsList.add(origin.substring(previouSpace, len));
                }
                else
                {
                    wordsList.add(origin.substring(previouSpace + 1, len));
                }
            }
        } //creates an array of words to pig latinate

        /*for(int i = 0; i < wordsList.size(); i++) 
        {   
            System.out.println(wordsList.get(i));
        }*/

        int wordCt = wordsList.size();
        char[] word;
        String syllable;
        int scroll = 0;
        String vowelStart;
        String wordListed;
        int wordLen;

        for (int i = 0; i < wordCt; i ++)
        {
            scroll = 0;
            word = wordsList.get(i).toCharArray();
            wordListed = wordsList.get(i);
            wordLen = wordListed.length();
            
            if (Character.toLowerCase(word[0]) == 'a' || Character.toLowerCase(word[0]) == 'e' || 
            Character.toLowerCase(word[0]) == 'i' || Character.toLowerCase(word[0]) == 'o' || Character.toLowerCase(word[0]) == 'u')
            {
                wordsList.set(i, wordListed + "way");
            }
            else
            {
                while (Character.toLowerCase(word[scroll]) != 'a' && Character.toLowerCase(word[scroll]) != 'e' && 
                Character.toLowerCase(word[scroll]) != 'i' && Character.toLowerCase(word[scroll]) != 'o' && Character.toLowerCase(word[scroll]) != 'u')
                {
                    scroll += 1;

                    if (scroll == wordLen - 1)
                    {
                        scroll = 1;
                        break;
                    }

                } //scroll will end up the vowel chara index

                syllable = wordListed.substring(0, scroll);
                //System.out.println(syllable + scroll);
                vowelStart = wordListed.substring(scroll, wordListed.length());
                //System.out.println(vowelStart);
                wordsList.set(i, vowelStart + syllable + "ay");
            }
        }
        
        for (int i = 0; i < wordCt; i++)
        {
            System.out.print(wordsList.get(i));
            if (i != wordCt - 1)
            {
                System.out.print(" ");
            }
        }

        System.out.println();
        input.close();
    }
}