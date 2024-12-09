package Serializacation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DriverListSerializacation {
	public static void main(String[] args) throws Exception{
		Employ e1=new Employ("Mohan", 325, "mohan123", 34546.56);
		Employ e2=new Employ("Sohan", 320, "4575fbcb", 44506.56);
		Employ e3=new Employ("Rohan", 328, "4575fb", 34946.56);
		Employ e4=new Employ("Manmohan", 323, "soh23", 40506.56);
		Employ e5=new Employ("HariMohan", 305, "moryrt23", 34046.56);
		Employ e6=new Employ("Jugmohan", 300, "sodfhr23", 44906.56);
		List<Employ> l1=new ArrayList<>();
		l1.add(e1);l1.add(e2);l1.add(e3);l1.add(e4);l1.add(e5);l1.add(e6);
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("D:\\empdetails1.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(l1);
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Inside catch block");
		}
		finally {
			fos.close();
			oos.close();
		}
		System.out.println("=====Serialization is Completed======");
	}

}
