public class firstnonrepeating {
    public static char firstnonrep(String str) {
        int [] freq = new int[256];
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(freq[ch]==1){
                return ch;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String str = "aabbccdeff";
        System.out.println(firstnonrep(str));
    }

}