package loopingExercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = input.nextInt();
		int OrgNum = num;
		int result =1;
		while (num>0) {
			result *=num;
			num--;
		}
		input.close();
		System.out.print("The factorial of "+OrgNum+" is "+result);
	}
	

}
