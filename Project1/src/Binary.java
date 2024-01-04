import java.util.ArrayList;
import java.lang.Math;


public class Binary {

	
	int findelement (int randomelement,ArrayList<Integer> arraylist) {

		
		int x;
		int y;
		int z=0;
		int arraylength;
		int i=0;
		double a=arraylist.size()*1.0;
		double c = Math.log(a)/Math.log(2);
		long maxiteration = Math.round(c)+1;
		
		
		while(i<=maxiteration) {
			

			y=Math.toIntExact(Math.round(arraylist.size()*0.5));
			x=arraylist.get(y-1);
			arraylength=arraylist.size();
			z=z+y;

		  if (x==randomelement) {
			  
			 System.out.println("The element " +randomelement+ " is at "+z);
			 break;
			 
		  }
		  
		  
		  else if (x<randomelement) {
			  
			  arraylist.subList(0, y).clear();
			  
		  }
		  
		  else if (x>randomelement) {
			  
			  arraylist.subList(y-1, arraylength).clear();
			  z=z-y;
			  
		  }
	
		  
		  i++;
			
		}
		

		return z;
	}
	
}
