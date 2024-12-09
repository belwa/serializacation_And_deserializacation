package Serializacation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DriverDeserialization {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("D://Programm7.txt");
			ois = new ObjectInputStream(fis);
			Employ e1 = (Employ)ois.readObject();
			System.out.println(e1);
			Employ e2 = (Employ)ois.readObject();
			System.out.println(e2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			fis.close();
			ois.close();
		}
		
		System.out.println("=========programme is completed======");

	}

}
