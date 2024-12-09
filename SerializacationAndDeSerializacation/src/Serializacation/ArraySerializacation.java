package Serializacation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ArraySerializacation {

	public static void main(String[] args) throws IOException {
		Employ e1=new Employ("Mohan", 325, "mohan123", 34546.56);
		Employ e2=new Employ("Sohan", 320, "4575fbcb", 44506.56);
		Employ e3=new Employ("Rohan", 328, "4575fb", 34946.56);
		Employ e4=new Employ("Manmohan", 323, "soh23", 40506.56);
		Employ e5=new Employ("HariMohan", 305, "moryrt23", 34046.56);
		Employ e6=new Employ("Jugmohan", 300, "sodfhr23", 44906.56);
       
		Employ [] x = new Employ[6];
	    x[0] = e1; x[1] = e2; x[2]= e3; x[3] = e4; x[4] = e5; x[5]= e6;
	    
	    FileOutputStream fos = null;
	    ObjectOutputStream ois = null;
	    
	    try {
			fos = new FileOutputStream("D://empDetails2.txt");
			ois = new ObjectOutputStream(fos);
			ois.writeObject(x);
			
		} catch (Exception e) {
			System.out.println("occur some error: "+ e.getMessage());
			System.out.println("Inside catch block");
		}
	    
	    finally {
	    	fos.close();
	    	ois.close();
	    }
	    
	    System.out.println("==========programme is completed===========");
			
	    
	    
		
	}

}
