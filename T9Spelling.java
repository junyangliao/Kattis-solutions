import java.util.*;
import java.util.HashMap;

public class T9Spelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = Integer.parseInt(sc.nextLine());
        HashMap<Character, String> keyDict = new HashMap<>();
        
        keyDict.put('a',"2");
        keyDict.put('b',"22");
        keyDict.put('c',"222");
        keyDict.put('d',"3");
        keyDict.put('e',"33");
        keyDict.put('f',"333");
        keyDict.put('g',"4");
        keyDict.put('h',"44");
        keyDict.put('i',"444");
        keyDict.put('j',"5");
        keyDict.put('k',"55");
        keyDict.put('l',"555");
        keyDict.put('m',"6");
        keyDict.put('n',"66");
        keyDict.put('o',"666");
        keyDict.put('p',"7");
        keyDict.put('q',"77");
        keyDict.put('r',"777");
        keyDict.put('s',"7777");
        keyDict.put('t',"8");
        keyDict.put('u',"88");
        keyDict.put('v',"888");
        keyDict.put('w',"9");
        keyDict.put('x',"99");
        keyDict.put('y',"999");
        keyDict.put('z',"9999");
        keyDict.put(' ',"0");


        for (int i =0;i<testcase;i++) {
            String tempstr = sc.nextLine();
            String result = "";
            int strlength = tempstr.length();

            for (int j =0;j<strlength;j++) {
                if (!result.isEmpty() && result.charAt(result.length()-1)==keyDict.get(tempstr.charAt(j)).charAt(0)) {
                    result += " ";
                }
                result += keyDict.get(tempstr.charAt(j));
            }

            System.out.println("Case #" + (i+1) + ": " + result);
        }
    }
}
