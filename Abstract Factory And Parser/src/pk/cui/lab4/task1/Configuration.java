package pk.cui.lab4.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Configuration {
	 public static Configuration obj;
	private  Configuration(){}
	
	
	public static  Configuration getInstance() {
	
		if (obj==null) {
			obj=new Configuration();
			return obj;			
		}
		else {
			return null;
		}

		
		
	}
	
	
	
	
	
	
	
	
	public void writeConfiguration(String key, String value ) {
		try{
			Properties properties = new Properties();
			properties.setProperty(key, value);
			OutputStream output = new FileOutputStream("config.properties");
			properties.store(output, null);
			output.close();
		}catch(IOException ex){
			ex.printStackTrace();
		}
	
		
	}
	
	public String readConfiguration(String key) {
	
		String value = null; 
		  try{ 
		   InputStream input = new FileInputStream("config.properties"); 
		   Properties properties = new Properties(); 
		   properties.load(input); 
		   value = properties.getProperty(key); 
		   input.close(); 
		  }catch(IOException ex){ 
		   ex.printStackTrace(); 
		  } 
		  return value; 
		 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
