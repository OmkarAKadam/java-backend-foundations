public class StringPractice {
    public static void main(String[] args) {
        //1. Reverse a String
        System.out.println("1. Reverse a String");
        String str = "Hello World";
        StringBuffer revString = new StringBuffer();

        for(int i = str.length() - 1; i >= 0; i--){
            revString.append(str.charAt(i));
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + revString);


        //2. Check Palindrome String
        System.out.println("\n2. Check Palindrome String");
        String palindromeStr = "madam";
        String revPalindromeStr= "";

        for(int i = palindromeStr.length() - 1; i >= 0; i--){
            revPalindromeStr += palindromeStr.charAt(i);
        }

        if(palindromeStr.equals(revPalindromeStr)){
            System.out.println(palindromeStr + " is a palindrome.");
        } else {
            System.out.println(palindromeStr + " is not a palindrome.");
        }

        //3. Count Vowels and Consonants
        System.out.println("\n3. Count Vowels and Consonants");
        String countStr = "Hello World";
        int vowelCount = 0;
        int consonantCount = 0;

        countStr = countStr.toLowerCase();
        for(int i = 0; i < countStr.length(); i++){
            char ch = countStr.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            } else if(ch >= 'a' && ch <= 'z'){
                consonantCount++;
            }
        }

        System.out.println("String: " + countStr);
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);

        //4. Remove Duplicate Characters
        System.out.println("\n4. Remove Duplicate Characters");
        String dupStr = "programming";
        String uniqueStr = "";

        for(int i = 0; i < dupStr.length(); i++){
            char ch = dupStr.charAt(i);
            if(uniqueStr.indexOf(ch) == -1){
                uniqueStr += ch;
            }
        }

        System.out.println("Original String: " + dupStr);
        System.out.println("String with Duplicates Removed: " + uniqueStr);

        //5. Compare String using == vs .equals()
        System.out.println("\n5. Compare String using == vs .equals()");
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        System.out.println("Using == operator:");
        System.out.println("str1 == str2: " + (str1 == str2)); // true, because string literals are interned
        System.out.println("str1 == str3: " + (str1 == str3)); // false, because str3 is a new object
        System.out.println("Using .equals() method:");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, because they have the same content
        System.out.println("str1.equals(str3): " + str1.equals(str3));
    }
}
