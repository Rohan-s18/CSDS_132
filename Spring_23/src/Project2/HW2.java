package Project2;

public class HW2{

    private static String reverseString(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = string.length() - 1; i >= 0; i--)
            stringBuilder.append(string.charAt(i));
        return stringBuilder.toString();
    }

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

        for(int i = start; i < string.length(); i+=skip){
            if((i-start)%except!=0)
                stringBuilder.append(string.charAt(i));
        }

        return stringBuilder.toString();
    }

    public static String flipEachK(String string, int k){
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        int subcount = 0;
        boolean order = true;
        while(index < string.length()){
            if(subcount==k){
                order=(!order);
                subcount = 0;
            }
                
            if(order){
                stringBuilder.append(string.charAt(index));
                index++;
                subcount++;
            }
            else if(!order){
                String tempString = reverseString(string.substring(index, Math.min(index+k, string.length())));
                stringBuilder.append(tempString);
                index+=k;
                order=true;
            }
                
        }
        
        return stringBuilder.toString();
    }

    public static String reverseDigits(String string){
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0; 
        int j = string.length() - 1;
        while(i < string.length()){
            while(i < string.length() && (((int)string.charAt(i) > 57) || (int)string.charAt(i) < 48)){
                stringBuilder.append(string.charAt(i));
                i++;
            }
            while(j >= 0 && (string.charAt(j) > '9' || string.charAt(j) < '0'))
                j--;
            if(j >= 0)
                stringBuilder.append(string.charAt(j));
            i++;
            j--;
        }
        return stringBuilder.toString();
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

        System.out.println();

        System.out.println(flipEachK("abcdefghijklmn", 4));

        System.out.println();

        System.out.println(reverseDigits("0 the d1gits of the2 string3 4 are8 reversed 9!"));

        System.out.println("\n");

    }

}