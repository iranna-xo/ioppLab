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
	void setContents(String contents)
	{
		this.contents = contents;
	}
	
	String getContents()
	{
		return contents;
		
	}
}
