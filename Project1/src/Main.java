import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter an arraylength");
	int arraylength = scanner.nextInt();
	int[] array =new int[arraylength];
	ArrayList<Integer> arraylist=new ArrayList<Integer>();
	
	
	Randomsortedarray nameoftitles = new Randomsortedarray(arraylength,array);

	nameoftitles.randomsortedarray();
	
	
	
	int[]myArray =new int[arraylength];
	
	for (int i=0; i<= arraylength-1; i++ ) {
		
		myArray[i]=nameoftitles.getcomponent(i);
		arraylist.add(i, myArray[i]);
	
		
	}
	
	scanner.close();
	
	Random random =new Random();
	int randomelement =myArray[random.nextInt(myArray.length)];  
	System.out.println("randomelement "+randomelement);
	

	
	Binary binary =new Binary();
	binary.findelement(randomelement, arraylist);
	

	}

}
