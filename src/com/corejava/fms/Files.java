package com.corejava.fms;
import java.io.File;
import java.util.*;
import java.io.File;
public class Files 
{
	String name;
	
	long  size;
	String filepath;
	String token;
	Files(String filepath)
	{
		this.filepath=filepath;
	    this.name = Extractfilename(filepath);
	    
		
	}
	

	
	
	public String  Extractfilename(String filepath)
	{
		String[] tokens =filepath.split("/");
		name = tokens[tokens.length-1];
		return name;
	}
	
	
	public String getName() 
	{
		return name;
	}
	
	
	public void  getSize() 
	{
		File file = new File(filepath);
				if(!file.exists() || !file.isFile()) 
					System.out.println("file doesnt exist");
				    
				
				else
					 size = file.length();
		
	}
	
	public void  displayinfo()
	{
		getSize();
		System.out.println("name:" + name + " size: "+size+"in bytes");
	}
	


}
