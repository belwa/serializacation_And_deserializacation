package Serializacation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ArrayDserializacation {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("D://empDetails2.txt");
			ois = new ObjectInputStream(fis);
			
			Object [] o = (Object[])ois.readObject();
			Employ[] k = (Employ[])o;
			
			for(Employ x:k) {
				System.out.println(x);
			}
			
		} catch (Exception e) {
			System.out.println("occur some error: "+ e.getMessage());
		}
		
		finally {
			fis.close();
			ois.close();
		}

	}

}
