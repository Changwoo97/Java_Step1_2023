package chapter06;

import java.util.Scanner;

public class StartMain {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Start start = new Start();

			while (true) {
				try {
					System.out.print("> ");
					int number = scan.nextInt();
					Start.Result result = start.check(number);
					System.out.println(result.name());
					if (result == Start.Result.SUCCESS) {
						break;
					}
				} catch (Exception e) {
					System.out.println("Error");
					scan.nextLine();
				}
			}
			System.out.println(start.getCount());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
