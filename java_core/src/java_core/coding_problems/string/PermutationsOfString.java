package java_core.coding_problems.string;

import java.util.Scanner;

public class PermutationsOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();

		permute(str, "");
	}
	
	 
	public static void permute(String str,String prefix) {
		if(str.length()==0) {
			System.out.println(prefix);
		}else {
			for(int i=0;i<str.length();i++) {
				String rem=str.substring(0,i)+str.substring(i+1);
				permute(rem,prefix+str.charAt(i));
			}
			
		}
	}
}
