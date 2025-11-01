package java_core.coding_problems.string;

import java.util.Scanner;

public class UniqueCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printUniqueChracters(str);
	}
	
	public static void printUniqueChracters(String str) {
		boolean[] unique=new boolean[128];
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(!unique[ch]) {
				unique[ch]=true;
				System.out.println(ch +" ");
			}
		}
	}
}
