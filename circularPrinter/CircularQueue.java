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
	 void insert(Printer obj)
	 {
		 if(isFull())
		 {
                         System.out.print("TEST CASE  :");
			 System.out.println(" Queue Overflow");
		 }
		 else
		 {	
			 
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
			 System.out.println("The contents of the front of the printer are as follows:");
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
