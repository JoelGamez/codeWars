//https://www.codewars.com/kata/credit-card-mask/train/java

/* Usually when you buy something, you're asked whether your credit card number, phone number or answer to your most secret question is still correct. However, since someone could look over your shoulder, you don't want that shown on your screen. Instead, we mask it.

Your task is to write a function maskify, which changes all but the last four characters into '#'.

Examples
maskify("4556364607935616") == "############5616"
maskify(     "64607935616") ==      "#######5616"
maskify(               "1") ==                "1"
maskify(                "") ==                 ""

// "What was the name of your first pet?"
maskify("Skippy")                                   == "##ippy"
maskify("Nananananananananananananananana Batman!") == "####################################man!" */


public class Maskify {
    public static String maskify(String str) {
        String result = "";
        String[] stringArray = str.split("");

        if (str.length() >= 4) {
            String substring = str.substring(str.length() - 4);
            int diff = str.length() - substring.length();
            for(int i = 0; i < stringArray.length ; i++){
                if(i < diff){
                    result += "#";
                } else {
                    result += stringArray[i];
                }
            }
            return result;
        } else {
            for(int i = 0; i < stringArray.length ; i++){
                    result += stringArray[i];
                }
                return result;
            }
    }
}
