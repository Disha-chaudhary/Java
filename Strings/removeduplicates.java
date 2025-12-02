public class removeduplicates {
    public static String removedup(String str) {
        String result = "";
        boolean [] seen = new boolean[256];
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(!seen[ch]){
                result += ch;
                seen[ch] = true;
            }
            else {
                continue;
            }
        }
        return result;
    }
public static void main(String[] args) {
        String str = "abbccda";
        System.out.println(removedup(str));
    }   

}