import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {

    public static void main(String[] args){
        System.out.println("Match: "+Regexp.matchText(args[0], args[1]));
    }


    public static boolean matchText(String text, String maxLength){
        String regexp = "^(?!.\"\\\\S+\")" +
                "(?=.*[a-z])(?=.*[A-Z])" +
                "(?=.*\\d)(?=.*[\\\\{}!\"#$%&'()*+,-./:;<=>?@^_`|~\\[\\]])" +
                "[A-Za-z\\d\\\\{}!\"#$%&'()*+,-./:;<=>?@^_`|~\\[\\]]" +
                "{1,"+maxLength+"}$";
        final Pattern pattern = Pattern.compile(regexp);
        final Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            return true;
        }
        return  false;
    }


}
