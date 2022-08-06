package MyownComposition;

import java.util.Scanner;

class iNeuron
{
	int guessnum;
  public int GuessNumber () {
	return guessnum;
}
   {
    
    Scanner scan = new Scanner (System.in);
   System.out.println("hey iNeuron please say any number");
   
   
   guessnum = scan.nextInt();
   }
}

class students
{
	
int stuguessnum;

public int numberFromstudent()
{
	
	Scanner scan = new Scanner(System.in);
	System.out.println("hey student please choose any one Token");
	
	 stuguessnum = scan.nextInt();
	return stuguessnum;
	
}
}

class Tokenreader
{
	int numfromiNeuron;
	int numfromstuden1;
	int numfromstuden2;
	int numfromstuden3;
	
	public void collectnumfromiNeuron()
	{
		iNeuron i = new iNeuron();
		numfromiNeuron = i.GuessNumber();
	}
	
	public void collectnumfromstudent() {
	
	
	students s1 = new students();
	students s2 = new students();
	students s3 = new students();
	
	numfromstuden1 = s1.numberFromstudent();
	numfromstuden2 = s2.numberFromstudent();
	numfromstuden3 = s3.numberFromstudent();
	
	
	}
	
	public void compare()
	{
		
		if (numfromiNeuron == numfromstuden1)
		{
			System.out.println("Hey congrates student 1 you won free coupon for Blockchain bootcamp");
			
			
		}
		else if (numfromiNeuron == numfromstuden2)
		{
			System.out.println("Hey congo student 2 you won free coupon for web development Boot camp");
		}
		
		
		else if (numfromiNeuron == numfromstuden3)
		{
			System.out.println("Hey congrates student 3 you won free coupon for Enterprise java ");
		}
		else if (numfromiNeuron==numfromstuden1 &&  numfromiNeuron==numfromstuden2 && numfromiNeuron==numfromstuden3) 
		{
			
			System.out.println("You all three get free NFT's from NEO");
		}
//		else if()
	}
	

}

public class Neo {

	public static void main(String[] args) {
		
		Tokenreader t = new Tokenreader();
		t.collectnumfromiNeuron ();
		t.collectnumfromstudent();
		t.compare();
		

	}

}



