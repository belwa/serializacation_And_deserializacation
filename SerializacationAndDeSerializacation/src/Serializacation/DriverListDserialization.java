package Serializacation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DriverListDserialization {

	public static void main (String[] args) throws IOException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("D:\\empdetails1.txt");
			ois = new ObjectInputStream(fis);
			List <Employ> o = (List<Employ>)ois.readObject();
			
			for(Object x: o) {
				System.out.println(o);
			}
			
		} catch (Exception e) {
	         System.out.println(e.getMessage());
		}
		
		finally {
			fis.close();
			ois.close();
		}
		
	}

}
