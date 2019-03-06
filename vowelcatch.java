import java.util.Scanner;
public class vowelcatch
{
	public static void main(String[] args) 
	{
            VowelCatcher vc = new VowelCatcher();
            vc.takeInput();
            vc.searchVowels();
	}
}
class VowelCatcher
{
    Scanner sc = new Scanner(System.in);
    String ui = "";
    String myVowels = "aeiou";
    int ctr = 0;
    int arr[] = new int[10];
    public void takeInput()
    {
        ui = sc.nextLine();
    }
    public void searchVowels()
    {
        try
        {
            for (int j = 0; j <= ui.length() - 1; j++)
            {
                for (int k = 0; k <= myVowels.length() - 1; k++)
                {
                    if (ui.charAt(j) == myVowels.charAt(k))
                    {
                        arr[ctr] = j;
                        ctr++;
                        System.out.println("Vowel: (" + ui.charAt(j) + ") at " + j + "th location.");
                        break;
                    }
                }
            }
            System.out.println("Total vowel character(s): " + ctr);
            System.out.println("Total vowel - delimited substring(s): " + (ctr - 1));
            System.out.println("Vowel - delimited substring(s) are: ");
            for (int i = 0 ; i <= ctr - 1; i++)
                System.out.println(ui.substring(arr[i], arr[i + 1] + 1));
        }catch(Exception e){}
    }
}
//sample input: Hello to the world of java
//sample output:
//
//Vowel: (e) at 1th location.
//Vowel: (o) at 4th location.
//Vowel: (o) at 7th location.
//Vowel: (e) at 11th location.
//Vowel: (o) at 14th location.
//Vowel: (o) at 19th location.
//Vowel: (a) at 23th location.
//Vowel: (a) at 25th location.
//Total vowel character(s): 8
//Total vowel - delimited substring(s): 7
//Vowel - delimited substring(s) are: 
//ello
//o to
//o the
//e wo
//orld o
//of ja
//ava