# ioppLab
Iopp lab circular queue printer implementation and report.


S D M College of Engineering & Technology, Dharwad
Department of Computer Science & Engineering 





IOPP LAB REPORT
ON
CIRCULAR PRINTER



Understanding the problem:

We are using the printer which is common to many devices, so the printer will get many documents to print from all these devices. 
So we are to come up with the data structure to print the document in an order. We couldn’t use the stack data structure as it is LIFO, which would lead ro cases where the first document received might not be printed at all.
Hence we have made use of the queue data structure and we made this circular in nature which would be helpful in saving the memory.
	
Industry Oriented Practices:

Industry oriented practices are the practices designed methodologically and structured way to achieve efficient and cost-effective use of resources. These are required as an industry consists of many personnel and departments which are working together on a single problem. Due to this reason we need practices which should be followed by everyone to achieve efficiency and cost-effective use of resources such as time, money, etc. Some of the industry oriented practices and how we have achieved them are as follows:

1.Naming convention and consistency:

Lower camel casing for variable and method names where the beginning character is not the special character. And for the classes and interface uses the upper camel casing where the first letter of the word is capital.
 
Eg:  For variable name: int variableName
       For classes and interface: class ClassName 

	Package name needs to start with lower case letter and the first word needs to be the domain name of the company in which we are working after which it should be followed by a period, then continue with name of the company or the institution which we are working followed by a period, then the name of the project we are presently working on and a period. After this we need to end it with the actual component we are presently working on.

Eg: com.sdmcet.ioppLab.circularPrinter 

2.Readable and efficient code:

Efficiency is the term used to depict the reliability, speed and programming methodology used in developing codes. Efficient programming is programming in a manner that, when a program is executed, uses a low amount of overall resources pertaining to computers. Efficient code not only improves the functionality of the code but it also reduces the time and space complexity of the program.
Readable code was achieved by giving names to packages, classes, methods, variables and interfaces which are relevant to the function that they perform. The code was made efficient by making use of proper data structure and algorithms which have good performance. The memory usage of the code was made efficient by not declaring unnecessary variables and dereferencing unwanted objects, which are in turn taken care of by the garbage collector, hence the memory was efficiently used. Breaking of loops when necessary, eliminating unnecessary operation, minimizing if-else statements instead using switch are some of the other practices followed to make the code efficient.


3.Portability:
Portability is a characteristic of a software program. A software is considered as portable, if it can be used in an operating system, different from the one in which it was created. For highly portable software, there is no need to make any changes to make it run in multiple platforms like Windows, LInux, MacOS.Basically the portability is usability of the same software in different environments. 
Eg: JAVA is a portable language. How? Java is called portable because you can compile a java code and give out the bytecode, then you can run that code with Java Virtual Machine. Java Virtual Machine should be present in the environment or platform in which you want to run the Java code.
4.Maintainability:
	To a developer, maintainable code simply means “code that is easy to modify or extend”. At the heart of maintainability is carefully constructed code that is easy to read; code that is easy to dissect in order to locate the particular component relating to a given change request; code that is then easy to modify without the risk of starting a chain reaction of breakages in dependent modules. And here we achieved maintainability by making separate functions for each task, so if we want to  change any parameter in the future, it will be easy. 
5.Testalility:
	
Testable code is code of high quality. It's cohesive and loosely coupled. It's well encapsulated and in charge of its own state. In short, it's singularly defined in its own proper place so that it's straightforward to maintain and extend.

Unit testing: Unit testing is a  testing technique using which individual modules are tested to determine if there are any issues by the developer himself. It is concerned with functional correctness of the standalone modules.

Integration testing: Integration testing is the second level of the software testing process after unit testing. In this testing, units or individual components of the software are tested in a group. The focus of the integration testing level is to expose defects at the time of interaction between integrated components or units.
	
	
6.Adaptability:

Adaptability is to be understood here as the ability of a system to adapt itself efficiently and fast to changed circumstances. An adaptive system is therefore an open system that is able to fit its behaviour according to changes in its environment or in parts of the system itself. We can achieve this by making use of inheritance to inherit the printer class and add features to cater to our needs. As of now we can print strings documents from the printer, but by making use of inheritance we can make the printer class have it take care of image and pdf.


7.Cohesiveness and Coupling:
Cohesion is the measure of the degree to which the elements of the module are functionally related. It is the degree to which all elements directed towards performing a single task are contained in the component. This was achieved by making a class diagram highly cohesive, by keeping all the methods and the variables necessary under a single package to perform a task. The classes were designed in such manner that they have high cohesion
Coupling is the measure of the degree of interdependence between the modules. A good software will have low coupling. As we can see in the class  diagram, the design is made in such a way that the interdependence is low in between the classes. This was done by keeping the variables and methods of different functionality in different classes. Thus the class diagram has low coupling.


8.Sufficiency:

	 When we are developing some software then we have to keep some points in our mind that the code should use less memory storage and that code should be reliable and sufficient, and Sufficiency is nothing but the number of code lines must be less and that code should perform the required operation in good manner, then we can say that the code is sufficient.

9.Completeness:
	
	Code is complete when it produces the correct output for all the possible inputs, and fails safely and gracefully in all possible situations where a correct output cannot be produced.


Tools used:

  	1. Eclipse: Eclipse is an integrated development environment (IDE) used in computer programming. It contains a base workspace and an extensible plug-in system for customizing the environment. Eclipse is written mostly in Java and its primary use is for developing Java applications, but it may also be used to develop applications in other programming languages via plug-in, such as C, C++, etc. 
We made use of this to write the code which was written in java and to test. This IDE was helpful as the compiler helped us to know what type of syntax errors we have done writing the code. The debugger was used to remove the logical errors in the code. This IDE also provided us with a console to give the inputs to our code. It also was helpful as it has a package explorer move through the packages. And all of the files related to a project are systematically stored here. We also have an option where we can export a project and convert it to a rar file. And this file can be imported in any other system to get the same project. This was helpful to achieve pair programming. We can even make an executable file for our project. This will make sure that we give only the application to the user, not the source code to the user.



	2. StarUML: StarUML is an open source software modeling tool that supports the UML (Unified Modeling Language) framework for system and software modeling. It is based on UML version 1.4, provides eleven different types of diagram and it accepts UML 2.0 notation. It actively supports the MDA (Model Driven Architecture) approach by supporting the UML profile concept and allowing it to generate code for multiple languages.
This software was made to draw the use case diagram, class diagram and the sequence diagram. The software has a feature where it generates the skeleton code for the given class diagram. This was used to generate the code for the respective classes. After which they were imported into the eclipse, in which the functionality was given to the methods.

3. Google docs: Google Docs is a free Web-based application in which documents and spreadsheets can be created, edited and stored online. Files can be accessed from any computer with an Internet connection and a full-featured Web browser. Google Docs is a part of a comprehensive package of online applications offered by and associated with Google. Users of Google Docs can import, create, edit and update documents and spreadsheets in various fonts and file formats, combining text with formulas, lists, tables and images. Google Docs is compatible with most presentation software and word processor applications. Work can be published as a Web page or as a print-ready manuscript. Users can control who sees their work. This was used to produce the report for the project. And was helpful for the same reason as the google slides.

4. Google meet: Google meet is a video conferencing service provided by google, that allows us to conference with 100 people at a time for some fixed amount of time. This was used to discuss the ideas, achieve pair programming and collaborate.

	5. GitHub: GitHub is a Git repository hosting service, but it adds many of its own features. While Git is a command line tool, GitHub provides a Web-based graphical interface. It also provides access control and several collaboration features, such as a wikis and basic task management tools for every project. This was used to manage the project and was helpful in achieving pair programming and to test the code. Github was useful to use as it provides use with version control. 
Link to the repo: https://github.com/iranna-xo/ioppLab


	



Code:

Code
/* *class circularQueue
     * to check queue overflow and underflow 
     * to insert/scan the input
     * to print the given input to output screen
     * test cases: queue overflow , queue underflow and correct input
     *
     *@author Iranna and Gurudev
*/
circularQueue
package com.sdmcet.ioppLab.circularPrinter;
import java.util.Scanner;
import com.sdmcet.ioppLab.circularPrinter.Printer;
public class CircularQueue {
	
	 private final int SIZE = 3;
	 private int front;
	 private int rear;
	 Scanner sc;
	 Printer [] objArray = null;
	 CircularQueue()
	 {
		 objArray = new Printer[SIZE];
		 front = -1;
		 rear =-1;
		 sc= new Scanner(System.in);
		
	 }
	 boolean isFull()				
	 {
		 if (front == 0 && rear == SIZE - 1)
		 {
		      return true;
		 }
		 if (front == rear + 1)
		 {
		      return true;
		 }
		    return false;
	 }

	 boolean isEmpty() 
	 {
		 if (front == -1)
	      return true;
		 else
		      return false;
	  }
	 void insert()
	 {
		 if(isFull())
		 {
                         System.out.print("TEST CASE  :");
			 System.out.println(" Queue Overflow");
		 }
		 else
		 {	
			 System.out.println("Enter the contents to be printed");
                         System.out.println("TEST CASE :Proper Input");
		     String content = sc.nextLine();
			
				Printer obj = new Printer(content);
			 if(front == -1)
				 front = 0;
			 rear = ( rear +1)% SIZE;
			 objArray[rear] = obj;
		 }			
	 } 
	 void print( )
	 {
		 if(isEmpty())
		 {
                         System.out.print("TEST CASE  :");
			 System.out.println(" Queue Underflow");
		 }
		 else 
		 {
			 System.out.println("TEST CASE  : Proper Output");
			 String s = objArray[front].getContents();
			 System.out.println("The contents of the front of the printer are as follows");
			 System.out.println(s);
			 if(front == rear) 
			 {
				front = -1;
				rear = -1;
				//resetting the queue
			 }
			 else
			 {
				 front = (front+1)%SIZE;
				 
			 }
		 }
	 }		 
}
/* main class
  * to select the menu: print or scan
  * test cases: invalid option
  *
  *@author Iranna and Harsha
  */ 
// main
package com.sdmcet.ioppLab.circularPrinter;
import java.util.InputMismatchException;
import java.util.Scanner;

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
			case "1":	cq.insert();
					// system call here 
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








/* printer class
*to copy the input from keyboard
*
*@author Jay Kumar
*/
//printer
package com.sdmcet.ioppLab.circularPrinter;
public class Printer {
	private String contents;
	
	Printer( )
	{
		this.contents = "Null";
		
	}
	Printer( String contents)
	{
		this.contents = contents;
	}
	
	String getContents()
	{
		return contents;
		
	}
}






	
 


