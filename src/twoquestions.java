import java.util.Scanner;

public class twoquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String input1 = "";
		String input2 = "";
		while (true) {
			System.out.println("is the item an animal, vegetable, or mineral?");
			input1 = scan.next();
			if (input1.equals("animal") || input1.equals("vegetable") || input1.equals("mineral")) {
				System.out.println("is the " + input1 + " bigger or smaller than your laptop?");
				input2 = scan.next();
				if (input2.equals("bigger") || input2.equals("smaller")) {
					System.out.println("is your " + input1 + " a...");
					break;
				} else {
					System.out.println("Enter bigger or smaller");
				}
			} else {
				System.out.println("Enter animal, vegetable, or mineral");
			}

		}
		if (input1.equals("animal") && input2.equals("bigger"))
			System.out.println("horse?");
		if (input1.equals("animal") && input2.equals("smaller"))
			System.out.println("rabbit?");
		if (input1.equals("vegetable") && input2.equals("bigger"))
			System.out.println("cabbage?");
		if (input1.equals("vegetable") && input2.equals("smaller"))
			System.out.println("potato?");
		if (input1.equals("mineral") && input2.equals("bigger"))
			System.out.println("car?");
		if (input1.equals("mineral") && input2.equals("smaller"))
			System.out.println("phone?");

	}
}
