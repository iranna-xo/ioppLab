package com.sdmcet.ioppLab.circularPrinter;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.sdmcet.ioppLab.circularPrinter.Printer;

public class Main {
	
	public static void main( String args[])
	{
		boolean exit = false;
		CircularQueue cq = new CircularQueue();
		Scanner sc = new Scanner(System.in);
		System.out.println( "Welcome to Printer/Scanner Application");
		for(;;)
		{
			String choice;
			System.out.println("Menu");
			System.out.println("1.Send content to printer");
			System.out.println("2.Print contents");
			System.out.println("3.Exit");
			
			choice = sc.nextLine();
			
			switch(choice)
			{
			case "1":
				System.out.println("Enter the contents to be printed");
                System.out.println("TEST CASE :Proper Input");
                String content = sc.nextLine();
	
                Printer obj = new Printer(content);
					cq.insert(obj);
					break;
			case "2":
				   cq.print();
				   break;
				   
			case "3":System.out.println("Switching off the printer");
					exit = true;
					break;
			default: System.out.println("TEST CASE  : Invalid choice");
					break;
			}
            if(exit)
            {
            	break;
            }
		}
		sc.close();
	}
}
