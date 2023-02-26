package JavaProgram;

public class palindrome {

	public static boolean palindormNumber(String str){
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(palindrome.palindormNumber("424")); 
	}
}
