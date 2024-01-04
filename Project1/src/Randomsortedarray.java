import java.util.*;
import java.util.Random;

public class Randomsortedarray {
	
	int arraylength;
	
	int[] array = new int[arraylength];
	
	
	Randomsortedarray (int arraylength, int[] array) {
		
		this.arraylength = arraylength;
		this.array = array;
		
	}
	
	
	
	void randomsortedarray () {
		
		
		int maxnumber;
		maxnumber = arraylength*10;
		
		
		Random random =new Random();
		array[0]=random.nextInt(maxnumber);

		for(int i=1; i <= arraylength-1; i++) {
		
			int x =random.nextInt(maxnumber);
			int j=0;
			array[i]=x;
			while (j <i) {
				if (array[i]==array[j]) {
			
					int y= random.nextInt(maxnumber);
					array[i]=y;	
					j=0;
					
				}
				else {
				j++;
				
				}	
			}
			
			
		
		}
		 Arrays.sort(array);
		 System.out.println(Arrays.toString(array));
	}
	
	
	int getcomponent (int i ) {
		
		return array[i];
	}
	

}
