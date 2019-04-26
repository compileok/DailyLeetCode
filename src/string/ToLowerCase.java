package string;

public class ToLowerCase {

    public static String toLowerCase(String str) {
        if(str == null) {
            return null;
        }
        char[] chars = str.toCharArray();
        for(int i = 0;i < chars.length; i++) {
            if(chars[i] < 'a' && chars[i]> 'A'){
                chars[i] = (char)(chars[i] - 'A' + 'a');
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String res = toLowerCase("HELLO");
        System.out.println(res.equals("hello"));

        // A65 B66
        // a97 b98
    }
}
