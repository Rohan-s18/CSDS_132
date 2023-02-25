package Project2;

public class HW2{

    public static boolean matchingParentheses(String string){
        int ct = 0;
        boolean encountered = false;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == '('){
                ct++;
                encountered = true;
            }
            else if(string.charAt(i) == ')')
                ct--;
        }
        return (ct == 0 && encountered);
    }

    public static String everyNthExcept(String string, int start, int skip, int except){
        start--;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.charAt(start));

        for(int i = start; i < string.length(); i++){
            if((i-start)%skip==0 && (i-start)%except!=0)
                stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }

    public static String flipEachK(String string){
        return string;
    }

    public static String reverseDigits(String string){
        return string;
    }

    public static String editOut(String string){
        return string;
    }

    public static String replaceText(String string1, String string2){
        return string1;
    }




    public static void main(String[] args) {

        System.out.println("\n");

        System.out.println(HW2.matchingParentheses("This is a (test (of the) (matching)) parentheses"));
        System.out.println(HW2.matchingParentheses("The (second closing) parenthesis) does not match"));

        System.out.println();

        System.out.println(everyNthExcept("abcdefghijklmnop", 2, 2, 4));
        System.out.println(everyNthExcept("abcdefghijklmnop", 3, 2, 4));

        System.out.println("\n");

    }

}