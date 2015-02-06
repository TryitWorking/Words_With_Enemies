import java.util.Scanner;

//Reddit Daily Challenge #198 Words With Enemies
public class Word_Game {

	public static void main(String[] arg)
	{
		System.out.println("Game is running");
		
		String firstWord;
		String secondWord;
		Scanner words = new Scanner(System.in);
		boolean play = true;
		
		while(play)
		{
			System.out.println("Game Start");
			System.out.println("Enter in two words, seperated by a space");
			firstWord = words.next();
			secondWord = words.next();
			
			//System.out.println(firstWord + "," + secondWord);
			//System.out.println(firstWord.length() + "," + secondWord.length());
			
			if((firstWord.length() != 0 || firstWord != null) && (secondWord.length() !=0 || secondWord != null))
			{
				for(int ii=0; ii<firstWord.length();ii++)
				{
					for(int jj=0; jj<secondWord.length();jj++)
					{
						if(firstWord.charAt(ii) == secondWord.charAt(jj))
						{
							String temp = ""+firstWord.charAt(ii);
							
							firstWord = firstWord.replaceFirst(temp, "");
							secondWord = secondWord.replaceFirst(temp, "");
							
							ii--;
							break;
						}
					}
				}
				
				
				System.out.println(firstWord + "," + secondWord);
				
				if(firstWord.length() > secondWord.length())
				{
					System.out.println("Left Side Wins!!!, " + firstWord.length() + " to " + secondWord.length());
				}
				else if(secondWord.length() > firstWord.length())
				{
					System.out.println("Right Side Wins!!!, " + firstWord.length() + " to " + secondWord.length());
				}
				else
				{
					System.out.println("Tie, Try Again, " + firstWord.length() + " to " + secondWord.length());
				}
				
				System.out.println("Continue playing? Y/N");
				firstWord = words.next();
				
				if(firstWord.compareToIgnoreCase("N") == 0 || firstWord.compareToIgnoreCase("NO") == 0)
				{
					play = false;
				}
						
				
				firstWord = "";
				secondWord = "";
			}
			else
			{
				System.out.println("Two words have to be inputted!");
			}
		}
		
		System.out.println("Hope you had Fun :)");
	}
	
}
