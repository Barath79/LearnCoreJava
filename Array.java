package javaExamples;

public class Array {

	public static void main(String[] args) {
		
		int[] intarray; //int array
		intarray = new int[10];
		String[] strarray1;  //str array
		strarray1 = new String[10];
		
		for(int i=0;i<10;i++) {
			intarray[i] = i;
			strarray1[i] = "abc";
		}
		
		
		for(int i=0;i<10;i++)
			System.out.println(intarray[i] + "  " + strarray1[i]);
		for(int i=0;i<10;i++)
			System.out.println(intarray[i] + "  " + strarray1[i]);
			}
	}

