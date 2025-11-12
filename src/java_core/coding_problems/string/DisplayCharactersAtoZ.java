package java_core.coding_problems.string;

public class DisplayCharactersAtoZ {
	public static void main(String[] args) {

		System.out.println("Characters from A to Z in capital letters are : ");
		for (int i = 65; i <= 90; i++) {
			System.out.print((char) i + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Characters from a to z in lower case are : ");
		for (int i = 97; i <= 122; i++) {
			System.out.print((char) i + " ");
		}
	}
}
