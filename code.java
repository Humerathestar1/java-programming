import java.util.regex.*;

class RegxDemo {
    public static void main(String[] args) {
        String s = "I am in Sage College";
        
        // Correct spelling "college"
        Pattern p = Pattern.compile("college", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);

        if (m.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
