package codility;

/**
 * @author BARNABA
 * @created 18/11/2023 - 7:06 PM
 * @project UdemyExercices
 */
public class RemoveConsecutiveStrings {
    public static void main(String[] args) {
        String Str1 = "CBACD";
        String Str2 = "CABABD";
        String Str3 = "ACBDACBD";
//        if(!S.matches("[ABCD]+")){
//            return;
//        }
//        if(S.length() < 0){
//            return;
//        }
//        if(S.length() >= 250000){
//            return;
//        }
        System.out.println("Result 1: "+checkString(Str1));
        System.out.println("Result 2: "+checkString(Str2));
        System.out.println("Result 3: "+checkString(Str3));
    }
    public static String checkString(String S){
        String newStr ="";
        if(validate(S)){
            newStr = S.replaceAll("AB", "");
            newStr=newStr.replaceAll("BA", "");
            newStr=newStr.replaceAll("CD", "");
            newStr=newStr.replaceAll("DC", "");
            return newStr;
        }
        return newStr;
    }
    public static boolean validate(String str){
        boolean passedValidation =true;
        if(!str.matches("[ABCD]+")){
            passedValidation=false;
        }
        if(str.length() < 0){
           passedValidation =false;
        }
        if(str.length() >= 250000){
            passedValidation=false;
        }
        return passedValidation;
    }
}
