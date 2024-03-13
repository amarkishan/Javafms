package com.corejava.fms;

import java.util.ArrayList;
import java.util.List;

public class test
{
	
	
	
	List<Files> files = new ArrayList<Files>();
	
	
   public void addfiles(Files f)
	
   {
	   files.add(f);
	   System.out.println("test");
   }
   
   public void display()
   {
	   for(Files f:files)
	   {
		   f.getName();
		   f.getSize();
	   }
   }
	public static void main(String[] args)
	{
	    test t = new test();
		Files filesarray[] = {
				new Files("C:/Users/18475/Documents/EAD-back.jpg"),
				new Files("C:/Users/18475/Documents/EAD-front.jpg"),
				new Files("C:/Users/18475/Documents/nlp_test.py")
		}; 
	   
		for (Files f1:filesarray)
		{
			t.addfiles(f1);
		}

	}

}
