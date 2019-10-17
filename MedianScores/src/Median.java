import java.util.Arrays;
import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
	

		int n ;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter number of scores :");
        n = s.nextInt();
        int i[] = new int[n];
        System.out.println("Enter the scores:");
        for(int j = 0; j < n; j++)
        {
            i[j] = s.nextInt();

        }
		 int[] scores = i;

	     double median = median(scores);
	     System.out.println("Median mark is : " + Math.round(median));
	  


	  }
	 
	  static double median(int[] scores) {

	     Arrays.sort(scores);
	     double median;

	     int totalScores = scores.length;

	     if (totalScores % 2 == 0) {
	        int middleScores = scores[totalScores / 2] + scores[totalScores / 2 - 1];

	        median = ((double) middleScores) / 2;
	     } else {
	        // get the middle element
	        median = (double) scores[scores.length / 2];
	        
	  }
	  return median;
	 }
}
