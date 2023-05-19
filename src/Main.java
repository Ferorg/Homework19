public class Main {
    public static void main(String[] args) {
        String str = "Hello world!!!";
        RefacrotString refacrotString = (s) -> {
            String st = s.toUpperCase();
            return st;
        };
        String a = refacrotString.getString(str);
        System.out.println(a);

        String strForSecondTask = "World";
        RefacrotString refacrotString2 = (s) -> {
            if (s.length() > 5) {
                s = s.substring(5);
                s=reverseString(s);
            }else if(s.length()<=5){
                s=reverseString(s);
            }
            return s;
        };
        System.out.println(refacrotString2.getString( strForSecondTask));

    }
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}

