public class ReverseString {
	
	/*
	 * Reverse string with loop
	 * */
	private String reverseLoop(String str) {
		String res = "";
		for(int i = str.length() - 1; i >= 0; i--)
			res += str.charAt(i);
		return res;
	}
	
	/*
	 * Reverse string with recursion
	 * */
	private String reverseRec(String str) {
		if (str.length() < 2) {
            return str;
        }

        return reverseRec(str.substring(1)) + str.charAt(0);
        // rec(HELLO) = OLLE + H
        // rec(ELLO)  = OLL	+ E
        // rec(LLO)   = OL	+ L
        // rec(LO) 	  = O	+ L
        // rec(O) 	  = O
	}
	
	public static void main(String[] args) {
		String str = "Hello";
		ReverseString rev = new ReverseString();
		System.out.println(str);
		System.out.println(rev.reverseLoop(str));
		System.out.println(rev.reverseRec(str));
		
	}
}
