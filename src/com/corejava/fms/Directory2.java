package com.corejava.fms;

import java.util.List;
import java.util.ArrayList;

public class Directory2 
{
	
	
	String name;
	List<Files> f = new ArrayList<Files>();
	List<Directory2> sd= new ArrayList<Directory2>();
//	public String getName() 
//	{
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	
	
	
	public  Directory2(String name)
	{
		this.name=name;
		//Sysytem.out.println("-Amar");
	}
	
	public void addsubdirectory(Directory2 d)
	{  
		
		sd.add(d);
	}
	
	public void removesubdirectory(Directory2 d)
	{
		if(sd.contains(d))
		{
			sd.remove(d);
		}
	}
	
	
	public void addfiles(Files file)
	{
		f.add(file);
		System.out.println("file is added succesfully");
	}
	
	public void  removefile(Files file)
	{
		if(f.contains(file))
		{
		
			f.remove(file);
			System.out.println("file is removed succesfully");
		}
		
	}
	
	 public void display()
	 {
		 for (int i=0;i < f.size(); i++)
		 {
			 System.out.println(f.get(i).getName());
			 
			 
		 }
	 }
	

}
