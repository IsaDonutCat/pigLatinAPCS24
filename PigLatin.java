import java.util.Scanner;
import java.lang.Character;
import java.util.ArrayList;

public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Original:");

        String origin = input.nextLine(); //gets input
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
                wordsList.add(origin.substring(previouSpace + 1, len));
            }
        } //creates an array of words to pig latinate

        /*for(int i = 0; i < wordsList.size(); i++) 
        {   
            System.out.println(wordsList.get(i));
        }*/

        int wordCt = wordsList.size();
        char[] word;

        for (int i = 0; i < wordCt; i ++)
        {
            word = wordsList.get(i);
            
        }
        //System.out.println(phrase);
        input.close();
    }
}