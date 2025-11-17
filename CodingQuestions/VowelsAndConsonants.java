public class VowelsAndConsonants {
    public static void main(String[] args) {
        int v = 0;
        int c= 0;
        String s = "Hello world";
        s = s.toLowerCase();
        for(char ch:s.toCharArray()){
            if(ch >= 'a' && ch<='z'){
                if("aeiou".contains(ch+"")){
                    v++;
                }
                else{
                    c++;
                }
            }
        }
        System.out.println(v +" "+ c);
    }
}
