package ebilet_uygulaması;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ebilet_arka {
	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
	    List<ebilet> eb = new ArrayList<>(); // polymorphism
	    
		int i = 0;
	    while (true) {
	    	eb.add(new ebilet());
	    	eb.get(i).seferSecimi();
	    	eb.get(i).seferSaati();
	    	eb.get(i).koltukAlımı();  	
	    	eb.get(i).biletNoBelirle();
	    	eb.get(i).odemeMiktari();
	    	System.out.println(eb.get(i).toString());
	    	System.out.println("Bilet satın alımınız başarılı bir şekilde tamamlanmıştır."
	    	+ "\nYeni bir bilet satın alım işlemi için D'ye basınız.\nVeya çıkış için X'e basınız: ");  
	    	String cikis = input.next().toUpperCase();
	    	System.out.println("-------------------------------------------------------------");
	    	if(cikis.equals("X")) { 
	    		break;
	    	}
	    	else
	    		i++;	
	    }
		
	}
}




