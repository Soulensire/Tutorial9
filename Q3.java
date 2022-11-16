//2-2 
//3 -6
//4 - 24
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
permuteString("coin","");
	}

	public static void permuteString(String n,String prefix) {
		if(n.length() == 0) {
			System.out.print(prefix + " ");

			return;
		}
		for(int i = 0; i < n.length(); i++) {
		
			permuteString(n.substring(0,i) + n.substring(i+1), prefix+n.charAt(i));
			
			
			
		}
		
	}
}
