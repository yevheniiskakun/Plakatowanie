
package new_project;

import java.util.Scanner;
import java.util.*; 


public class Poster {
	public static void main(String[] args) {
	
	int abort = 0;
	
	int[][] dimensions_array = new int[2][100];
		
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	int buildings_amount = scanner.nextInt();
	
		for(int i = 0; i < buildings_amount; i++) {
			scanner = new Scanner(System.in);
			String input_dimensions = scanner.nextLine();                
			String[] numbers = input_dimensions.split(" ");
			
			int first_side;
			int second_side;
			
			try {
				first_side = Integer.parseInt(numbers[0]);
				second_side = Integer.parseInt(numbers[1]);
				
				if(first_side <= 0) {
					System.out.println("First side must be greater than 0");
					abort = 1;
				}
				else {
					dimensions_array[0][i] = first_side;
				}
				if(second_side <= 0) {
					System.out.println("Second side must be greater than 0");
					abort = 1;
				}
				else {
					dimensions_array[1][i] = second_side;
				}
	            
			}catch(NumberFormatException e) {
				System.out.println("Please enter only numbers");
			}
		}
		
		if(abort == 0) {
			ArrayList<Integer> s = new ArrayList<Integer>();
			int poster_amount = 0;
			for (int i = 0; i < buildings_amount; ++i)
			{
				for (;s.size() > 0 && s.get(s.size() - 1) > dimensions_array[1][i];)
				{
					s.remove(s.size() - 1);
				}
				if (s.size() == 0 || s.get(s.size() - 1) < dimensions_array[1][i])
				{
					s.add(dimensions_array[1][i]);
					++poster_amount;
				}
			}
			System.out.println(poster_amount);
		}
		else {
			System.out.println("Can not count amount of posters");
		}
			
	}
}
