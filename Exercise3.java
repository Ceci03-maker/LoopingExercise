package loopingExercises;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = input.nextInt();
		int i=1;
		int result;
		while(i<=10) {
			result = i*num;
			System.out.println(num +" * " + i +" = "+ result);
			i+=1;
		}

	}

}
