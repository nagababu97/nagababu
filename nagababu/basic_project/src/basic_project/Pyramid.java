package basic_project;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of rows for the pyramid: ");
		        int numRows = scanner.nextInt();

		        for (int i = 1; i <= numRows; i++) {
		           for(int j=numRows-1;j>=i;j--) {
		        	   System.out.print(" ");
		           }
		           for(int k=1;k<=i;k++) {
		        	   System.out.print("* ");
		           }
		           System.out.println();
		            
		    }
		


	}

}
