package javaExamples;

public class Conditions {
	
	public static void main(String[] args) {
		
		int a=10,b=11;
		int[] z = {10,20,30};
		
		// if else
		if(a<b)
			System.out.println("Less");
		else
			System.out.println("More");
	
		// switch
		switch(a) {
		case 1: 
			System.out.println("one");
			break;
		case 2:
			break;
		default:
			break;
		}
			
		// while
		while(a==10) {
			System.out.println("Inside while");
			a++;
		}
		
		// do-while
		do {
		}
		while(a<b);
		
		
		
	    // for loop
		for(int j=0;j<10;j++) {
			System.out.println("For");
		}
		
		for(int jj:z) {
			System.out.println(jj);
		}
				
	}
} //End of class

	


