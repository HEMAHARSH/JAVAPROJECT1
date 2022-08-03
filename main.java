package miniproject;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.regex.*;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Date;
import java.time.*;
public class main {

	public static void main(String[] args) {
		try {
			File obj=new File("myfile.txt");
			if(obj.createNewFile())
			{
				System.out.println("File created:"+obj.getName());
			}
			else
			{
				//System.out.println("File already exists");
		            Scanner Reader = new Scanner(obj);
		            while (Reader.hasNextLine()) 
		            {
		            	String name =Reader.next();
		                String data = Reader.next();
		               if(Pattern.matches("[7-9]{1}[0-9]{9}",data))
		               {
		                //System.out.println(data);
		                File obj1=new File(name+".txt");
		                if(obj1.createNewFile())
		                {
		                	System.out.println("Created");
		                	}
		                else {
		                  	Calendar c = Calendar.getInstance();
		                    Date time = c.getTime();
		                	FileWriter Writer
		                    = new FileWriter(name+".txt");
		                Writer.write(time.toString());
		                Writer.close();
		 		                }
		                	
		               }
		            }
		            Reader.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occured.");
			e.printStackTrace();
		}
		    
	

	}

}
