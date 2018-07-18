package javaExamples;

public class Array {

	public static void main(String[] args) {
		
		int[] intarray; //int array
		intarray = new int[10];
		String[] strarray;
		strarray = new String[10];
		
		for(int i=0;i<10;i++) {
			intarray[i] = i;
			strarray[i] = "abc";
		}
		
		
		for(int i=0;i<10;i++)
			System.out.println(intarray[i] + "  " + strarray[i]);
			}
	}

