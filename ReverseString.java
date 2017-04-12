
public class ReverseString {
	
	
	
	
	private String getReverseString(String actualString) {
		
		StringBuilder sBuilder = new StringBuilder();
		
		for(int index = actualString.length()-1 ; index>= 0 ; --index) {
			
			sBuilder.append(actualString.charAt(index));
		}
		
		
		return sBuilder.toString();
	}
	
	public static void main(String[] args) {
		
		ReverseString obj = new ReverseString();
		String actualString = "Program to print reverse of a string with out reverse method";
		String reverseString = obj.getReverseString(actualString);
		System.out.println("The actual String is " +actualString);
		System.out.println("The reverse of String is " +reverseString);
	}

}
