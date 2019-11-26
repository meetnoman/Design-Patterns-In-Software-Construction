package pk.cui.lab4.task1;

public class Demo {

	public static void main(String[] args) {
 
		Configuration config = Configuration.getInstance(); 
		   
		  config.writeConfiguration("server", "localhost"); 
		     
		  System.out.println(config.readConfiguration("server")); 
		
	}

}
