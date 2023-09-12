import java.util.Scanner;
import java.lang.Character;
import java.util.ArrayList;

public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Original:");
        String origin = input.nextLine();
        ArrayList<String> wordsList = new ArrayList<String>();
        char[] phrase = origin.toCharArray();
        int len = origin.length();
        int spaceCount = 0;
        int previouSpace = 0;;

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
                wordsList.add(origin.substring(previouSpace + 1, len));
            }
        }

        /*for(int i = 0; i < wordsList.size(); i++) 
        {   
            System.out.println(wordsList.get(i));
        }*/

        //System.out.println(phrase);
        input.close();
    }
}