
public class Q2b {

	public static void main(String[] args) {
		
		convertToBinary(14);

	}
	
	//base case 

	public static void convertToBinary(int n) {
		
		//base case is n == o or .
		if(n== 0) {
			
			
			return;
		}
		convertToBinary(n/2);

		System.out.print(n = n % 2);
		
		
	}
}
