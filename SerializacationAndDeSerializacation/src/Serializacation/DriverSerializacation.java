package Serializacation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DriverSerializacation {

	public static void main(String[] args) throws IOException {
		Employ e1 = new Employ("Mohan", 325,"mohan123", 34546.56);
		Employ e2 = new Employ("Sohan", 232,"sohna123", 44546.57);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("D://Programm7.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
			oos.writeObject(e2);
			
			System.out.println("the programme successfully Printed");
			
		} catch (FileNotFoundException e) {
			System.out.println("the code some error: "+ e.getMessage());
			
		}
		
		finally {
			fos.close();
			oos.close();
		}
		
		System.out.println("=================the programme is ended==============================");
		
		

	}

}
