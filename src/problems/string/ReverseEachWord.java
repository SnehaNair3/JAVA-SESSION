package problems.string;

import java.util.Scanner;

public class ReverseEachWord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string input : ");
	String input=sc.nextLine();
	reverseEachWord(input);
}

public static void reverseEachWord(String input) {
	String[] words=input.split(" ");
	String reversedString="";
	for(int i=0;i<words.length;i++) {
		String word=words[i];
		String result="";
		char ch;
		for(int j=0;j<word.length();j++) {
			ch=word.charAt(j);
			result=ch + result;
		}
		reversedString=reversedString + result  + " ";
	}
	System.out.println("Input string is : " + input);
	System.out.println("Reversed word output String  is :  " + reversedString);
}
}
