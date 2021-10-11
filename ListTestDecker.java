//Import Java Utilities
import java.util.*;

public class ListTestDecker
{
	public static void main (String [] args)
	{
	
		Scanner input = new Scanner(System.in);
		int answer;
		int value;
		int size;
		int placeholder;
		int terminate;
		int remove1;
		
		//Prompt User to enter input into array and store array value
		LinkedListDecker newDecker =  new LinkedListDecker();

do
{
	do
	{	
		//Builds the Menu and responses to prompts
		System.out.println("------Linked List Test Program------");
		   System.out.println("0 - Exit Program");
		   System.out.println("1 - Add First Node: ");
		   System.out.println("2 - Add Last Node: ");
		   System.out.println("3 - Add at Index: ");
		   System.out.println("4 - Remove First Node: ");
		   System.out.println("5 - Remove Last Node: ");
		   System.out.println("6 - Remove At Index: ");
		   System.out.println("7 - Print List Size: ");
		   System.out.println("");
		   System.out.print("Select Option: ");
		   answer = input.nextInt();
		   System.out.println("");
		
		   //If statement for user input of 1
		if (answer == 1)
		{
			System.out.print("Please Enter the Value to Add to the First Node: ");
			placeholder = input.nextInt();
			System.out.println(" ");
			
			System.out.println ("Test Method addFirst() ");
			System.out.println("List Content Before Adding First Node: " + newDecker.toString() );
			newDecker.addFirst(placeholder);
			System.out.println("List Content After Adding First Node: " + newDecker.toString());
			System.out.println(" ");
		}
		
		//If statement for user input of 2
		if (answer == 2)
		{
			System.out.print("Please Enter the Value to Add to the Last Node: ");
			placeholder = input.nextInt();
			System.out.println(" ");
			
			System.out.println("Test Method addLast()");
			System.out.println("List Content Before Adding Last Node: " + newDecker.toString());
			newDecker.addLast(placeholder);
			System.out.println("List Content After Adding Last Node: " + newDecker.toString());	
		}
		
		//If Statement for user input of 3
		if (answer == 3)
		{
			System.out.print("Please Enter the Value to Add: ");
			placeholder = input.nextInt();
			
			System.out.print("Please Enter the Index Where You Would Like to Add the Value: ");
			value = input.nextInt();
			System.out.println(" ");
			
			
			System.out.println("Test Method add()");
			System.out.println("List Content Before Adding at Index: " + newDecker.toString());
			newDecker.add(value, placeholder);
			System.out.println("List Content After Adding at Index: " + newDecker.toString());	
		}
		
		//If statement for user input of 4
		if (answer == 4)
		{
			System.out.println("Test Method removeFirst()");
			System.out.println("List Content Before Adding at Index: " + newDecker.toString());
			newDecker.removeFirst();
		    System.out.println("List Content After Adding at Index: " + newDecker.toString());
		}
	
		//If statement for user input of 5
		if (answer == 5)
		{
			System.out.println("Test Method removeLast()");
			System.out.println("List Content Before Removing Last Node: "+ newDecker.toString());
		    newDecker.removeLast();
		    System.out.println("List Content After Removing Last Node: " + newDecker.toString());
		}
		
		//If statement for user input of 6
		if (answer == 6)
		{	
			System.out.print("Please Enter the Index to Remove: ");
			remove1 = input.nextInt();
			System.out.println("Test Method remove()");
			System.out.println("List Content Before Removing at Index: " + newDecker.toString());
			newDecker.remove(remove1);
			System.out.println("List Content After Removing at Index: " + newDecker.toString());
		}
		
		//If statement for user input of 7
		if (answer == 7)
		{
			size = newDecker.size();
			if (size > 0)
			{
			System.out.println("Test Method size()");
			System.out.println("The Size of the Linked List Is: " + newDecker.size());
			System.out.println(" ");
			}
			else if (size == 0)
			{
			System.out.println("The Size of the LInked List Is: " + size);
			System.out.println("The Current List Is Empty!");
			System.out.println(" ");
			}
		}
		
		//Prompt User to Continue to Run the Program
		System.out.print("Would You Like to Continue to Run the Program (1 to Continue or 0 to Quit): ");
		terminate = input.nextInt();
		System.out.println(" ");
	}
	
	while ((answer != 0) || (terminate != 0));
		
}
while ((answer != 0) || (terminate != 0 ));
	{
		System.out.println(" ");
		System.out.println("Program Terminated");

	}
	
}
}
