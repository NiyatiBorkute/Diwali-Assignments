package codingchallenge;

public class CheckAlphanumeric {
    public static void main(String[] args) {
        String str = "Hello123";
        boolean isAlphanumeric = true;

        for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                isAlphanumeric = false;
                break;
            }
        }

        if (isAlphanumeric)
            System.out.println("String contains only alphanumeric characters.");
        else
            System.out.println("String contains non-alphanumeric characters.");
    }
}

