public class WordReverser {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {

            String reversed = new StringBuilder(words[i]).reverse().toString();
            result.append(reversed);
            
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        String test = "Hello world this is Java";
        System.out.println("Original: " + test);
        System.out.println("Reversed: " + reverseWords(test));
        
        
        System.out.println("\nAnother test:");
        System.out.println(reverseWords("Programming is fun"));
    }
}
