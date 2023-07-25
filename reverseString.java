public class reverseString {
        public static String reverseString(String input) {
            // Convert the input string to a character array
            char[] charArray = input.toCharArray();
            int left = 0;
            int right = charArray.length - 1;

            // Swap characters from both ends until the middle is reached
            while (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }

            // Convert the character array back to a string and return it
            return new String(charArray);
        }

        public static void main(String[] args) {
            String input = "chandana";
            String reversed = reverseString(input);
            System.out.println("Reversed string: " + reversed);
        }
    }

