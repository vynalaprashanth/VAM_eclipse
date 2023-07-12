package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class dataprovider 
{
	static File file= new File("./Driver/login.properties");
	static Properties prop;
	public dataprovider() 
	{
		 
		
		try 
		{
    	   
    	 FileInputStream fis= new FileInputStream(file);
           prop= new Properties();
          prop.load(fis);     
		}
		catch(FileNotFoundException e) 
		{
        	  e.printStackTrace();
        }
		catch (IOException e) 
		{
        	  e.printStackTrace();
        }
		finally
		{
        	  if(file.exists()) 
        	  {
        		  System.out.println("file connected");
        	  }
        	  else 
        	  {
        		  System.out.println("file not connected");
        		  
        	  }
		}
	}
	public String getappurl() 
	{
		return prop.getProperty("appurl");
	}
	public String getusername() 
	{
		return prop.getProperty("username");
	}
	public String getpassword()
	{
		return prop.getProperty("password");
	}
	public String getunelement()
	{
		return prop.getProperty("unelement");
	}
	public String getpwelement()
	{
		return prop.getProperty("pwelement");	
	}
	public String getsubmit() 
	{
		return prop.getProperty("submit");
	}
	public String getlogout() 
	{
		return prop.getProperty("logout");
	}
	
	public static void main(String[]args)
	{
		dataprovider dr=new dataprovider();
		System.out.println(dr.getappurl());
		System.out.println(dr.getusername());
		System.out.println(dr.getpassword());
	    System.out.println(dr.getunelement());
	    System.out.println(dr.getpwelement());
	    System.out.println(dr.getsubmit());
		System.out.println(dr.getlogout());
	}
	
	}	
	


