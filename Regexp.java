import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {

    public static void main(String[] args) {
        boolean match = true;
        if (args.length < 2) {
            match = false;
        } else {
            try {
                Integer.parseInt(args[1]);
            } catch (NumberFormatException nfe) {
                match = false;
            }
        }

        if (match) {
            match = Regexp.matchText(args[0], args[1]);
        }
        Regexp.printResult(match);
    }

    private static void printResult(boolean match) {
        System.out.println("Match: " + match);
    }


    public static boolean matchText(String text, String maxLength) {
        String regexp = "^(?!.\"\\\\S+\")" +
                "(?=.*[a-z])(?=.*[A-Z])" +
                "(?=.*\\d)(?=.*[\\\\{}!\"#$%&'()*+,-./:;<=>?@^_`|~\\[\\]])" +
                "[A-Za-z\\d\\\\{}!\"#$%&'()*+,-./:;<=>?@^_`|~\\[\\]]" +
                "{1," + maxLength + "}$";
        final Pattern pattern = Pattern.compile(regexp);
        final Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return true;
        }
        return false;
    }


}
