package tj.playground.java.problemsolving;

public class ReverseString {
    public static void main(String[] args) {
        String str1 = "Annamu";

//reversed string will be stored in rev variable
        String rev = new StringBuffer(str1).reverse().toString();

//print string before reverse
        System.out.println("\nString before reversal : "+str1);

//print string after reverse
        System.out.println("String after reversal : "+rev);
    }
}
