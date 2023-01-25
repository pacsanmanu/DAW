package Leetcode;

public class Ej3 {
    public static void main(String[] args) {
        String prueba = "au";
        System.out.println(lengthOfLongestSubstring(prueba));
    }

    public static int lengthOfLongestSubstring(String s) {
        boolean repeated = false;
        char[] characters = new char[s.length()];
        String substring = "";
        String substring2 = "";
        char aux;

        for(int i = 0; i < s.length(); i++){
            aux = s.charAt(i);
            for(int j = 0; j < characters.length; j++){
                if(aux == characters[j]){
                    repeated = true;
                }
            }
            if(!repeated){
                substring2 += aux;
                characters[i] = aux;
            }else{
                characters = new char[s.length()];
                if(substring2.length() > substring.length()){
                    substring = substring2;
                    substring2 = "" + aux;
                    characters[i] = aux;
                }else{
                    substring2 = "" + aux;
                    characters[i] = aux;
                }
            }
            repeated = false;
        }

        if(substring2.length() > substring.length()){
            substring = substring2;
        }

        return substring.length();
        
    }
}
