import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;  
import com.opencsv.CSVReader;  
public class SimpleService {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		System.out.println("Printing the topics in CSV file");
		String line = "";  
		String splitBy = ",";  
		try   
		{   
		BufferedReader br = new BufferedReader(new FileReader("D:\\Users\\aakashv\\Downloads\\File_First.csv"));  
		while ((line = br.readLine()) != null)  
		{  
		String[] excel = line.split(splitBy);  
		System.out.println(excel[0]);
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}  
	}

}