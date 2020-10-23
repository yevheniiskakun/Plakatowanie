package new_project;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*; 


public class Poster {
	public static void main(String[] args) throws IOException {
	
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
		
	int abort = 0;
	
	String input_file_path = "poster.txt";
	
	int[][] dimensions_array = new int[2][100];
	int buildings_amount = 0;
	
	// File reading
	// If we does not have a file than read info from console
	try {
	      File myObj = new File(input_file_path);
	      Scanner myReader = new Scanner(myObj);
	      
	      int counter  = 0;
	      while (myReader.hasNextLine()) {
	        String readed_data = myReader.nextLine();

	        // Check the first line if we have one number it will be amount of buildings otherwise we have sides size
	        try {
	        	buildings_amount = Integer.parseInt(readed_data);
	        }
	        catch(NumberFormatException e){
	        	String[] numbers = readed_data.split(" ");
				
				int first_side;
				int second_side;
				
				try {
					first_side = Integer.parseInt(numbers[0]);
					second_side = Integer.parseInt(numbers[1]);
					
					if(first_side <= 0) {
						abort = 1;
					}
					else {
						dimensions_array[0][counter] = first_side;
					}
					if(second_side <= 0) {
						abort = 1;
					}
					else {
						dimensions_array[1][counter] = second_side;
					}
				}catch(NumberFormatException e1) {
	  			}
	        }   
	       counter++;
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	    	// Read input from console if we have incorrect path or some troubles with reading the file
	    	int input = scanner.nextInt();
	    	
	    	buildings_amount = input;
	    	
	    	for(int i = 0; i < buildings_amount; i++) {
				scanner = new Scanner(System.in);
				String input_dimensions = scanner.nextLine();              //reads string   
				String[] numbers = input_dimensions.split(" ");
				
				int first_side;
				int second_side;
				
				try {
					first_side = Integer.parseInt(numbers[0]);
					second_side = Integer.parseInt(numbers[1]);
					
					if(first_side <= 0) {
						abort = 1;
					}
					else {
						dimensions_array[0][i] = first_side;
					}
					if(second_side <= 0) {
						abort = 1;
					}
					else {
						dimensions_array[1][i] = second_side;
					}
				}
				catch(NumberFormatException e1) {
	  			}
	    }
			}
			// Does not write anything if we have incorrect input data
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
				
			}	
	}
}
