import java.io.*;

public class Palindrome {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter a word to test. Use 'exit' to stop application");
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
       		String inputString = "null";
		while(!(inputString.equals("exit"))){
	
		boolean valid = true;
		while(valid) {
           		 try {
               			inputString = bufferedReader.readLine();

               			 valid = false;

           		 } catch (Exception e) {
               			 e.printStackTrace();
           		 }
       		}
		if (!(inputString.equals("exit"))){
			System.out.println("Array method: "+isPalindromeArrayLoop(inputString));
   			System.out.println("StringBuilder method: "+isPalindromeStringBuilder(inputString));
		}
		}
	
	}

	private static boolean isPalindromeArrayLoop(String inputString) {
	        boolean isPalindrome = true;
       		char[] charArray = new char[inputString.length()];
        
        	for (int i=0; i<charArray.length; i++){
            		charArray[i]=inputString.charAt(i);
        	}
        
        	for (int i=0; i<charArray.length; i++){
            		if (charArray[i] == charArray[charArray.length-1-i]){
                		isPalindrome = true;
            		 } else {
               			 isPalindrome = false;
               			 i = 1+charArray.length;
           		 }
       		 } 

       		return isPalindrome;
   	}

   	private static boolean isPalindromeStringBuilder(String inputString) {
                boolean isPalindrome = false;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(inputString);
                stringBuilder.reverse();
                String temp = stringBuilder.toString();
                if (temp.equals(inputString)){
                        isPalindrome=true;
                }

                return isPalindrome;
       }
}
