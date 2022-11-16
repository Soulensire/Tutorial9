
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1 = "Wonderful Day";
		reverse(string1);


	}
public static void reverse(String n) {
	
	if(n.length()==0){
		
		System.out.println();
		return;
		
	}
	
	reverse(n.substring(1));
	System.out.print(n.charAt(0));

//	else {
		
		
		
	//}
	
}


}
