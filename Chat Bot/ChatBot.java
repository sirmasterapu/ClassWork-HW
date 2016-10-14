/**
*This is a chatbot that talks back to you
*Until you type in bye or Bye.
*@author Apurva Memani
*version 1.0
*/

import java.util.Scanner;

public class ChatBot
{
	
	public static void main(String[] args)
	{
		//creating a scanner object to get input from the keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = keyboard.nextLine();
		if (name.equals("bye"))
		{
			System.out.println("Bye");
			System.exit(0);
		}
		if (name.equals("Bye"))
		{
			System.out.println("Bye");
			System.exit(0);
		}
		System.out.print("Hi " + name + "! How are you doing? ");
		String input = keyboard.nextLine();
		//get rid of the new line char from the scanner object
		if (input.equals("bye"))
		{
			System.out.println("Bye");
			System.exit(0);
		}
		if (input.equals("Bye"))
		{
			System.out.println("Bye");
			System.exit(0);
		}
		
		System.out.println("I am glad that you are " + input);
		System.out.print("So, " + name + " Whats your favorite food? ");
		//int age = keyboard.nextInt();
		//keyboard.nextLine();
		
		input = keyboard.nextLine();
		if (input.equals("bye"))
		{
			System.out.println("Bye");
			System.exit(0);
		}
		if (input.equals("Bye"))
		{
			System.out.println("Bye");
			System.exit(0);
		}
		System.out.println(input + "! wow that sounds good!");
		System.out.print("What school do you go to? ");
		String response = keyboard.nextLine();
		if (response.equals("bye"))
		{
			System.out.println("Bye");
			System.exit(0);
		}
		if (response.equals("Bye"))
		{
			System.out.println("Bye");
			System.exit(0);
		}
		System.out.println(response + "! Nice!");
		String life = "Life";
		
		while (!life.equals("Bye"))
			
		{
			if (life.equals("bye"))
			{
				break;
			}
			else
			{
				System.out.println("So what else is going on in life? ");
				life = keyboard.nextLine();
			}
		}
		System.out.println("Bye!");
	}
}