import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Main{
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= t; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
	}
}
