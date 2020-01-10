import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.codePointBefore;
import static java.lang.Character.toLowerCase;

public class Accumulators {
    public static void main(String[] args) {

//        // ~~~~~~~~~~~~~~~~~~~~ ALL EQUAL ~~~~~~~~~~~~~~~~~~~~
//
//        // create the string
//
////        String string = "aAa";
////        String string = "aaa";
////        String string = "aba";
//        String string = "aBa";
//
//        // create the accumulator
//        char firstLetter = toLowerCase(string.charAt(0));
//        // iterate over the string
//
//        boolean allEqual = true;
//
//        for (int i = 0; i < string.length(); i++){
//            if (toLowerCase(string.charAt(i)) != firstLetter){
//                allEqual = false;
//            }
//        }
//
//        System.out.println(allEqual);
//        // ~~~~~~~~~~~~~~~~~~~~ ALL EQUAL ~~~~~~~~~~~~~~~~~~~~


//        // ~~~~~~~~~~~~~~~~~~~~ INTERLEAVE ~~~~~~~~~~~~~~~~~~~~
//
//        // create the string
//
//        String string = "aabbccc";
//
//        // create the accumulator
//
//        Map<Character, Integer> counter = new HashMap<>();
//
//        // iterate over the string
//
//        for (int i = 0; i < string.length(); i++){
//            if (!counter.containsKey(string.charAt(i))){
//                counter.put(string.charAt(i), 1);
//            } else {
//                int current = counter.get(string.charAt(i));
//                current++;
//                counter.replace(string.charAt(i), current);
//            }
//        }
//        // print the accumulator
//
//        System.out.println(counter);
//


//        // ~~~~~~~~~~~~~~~~~~~~ INTERLEAVE ~~~~~~~~~~~~~~~~~~~~
//
//        // create the two ArrayLists
//
//        ArrayList<Character> letterList1 = new ArrayList();
//
//        letterList1.add('a');
//        letterList1.add('c');
//
//        ArrayList<Character> letterList2 = new ArrayList();
//
//        letterList2.add('b');
//        letterList2.add('d');
//
//        // create the accumulator
//
//        ArrayList<Character> combinedList = new ArrayList();
//
//        // iterate to combine them
//
//        for (int i = 0; i < letterList1.size(); i++){
//            combinedList.add(letterList1.get(i));
//            combinedList.add(letterList2.get(i));
//        }
//
//        // return the accumulator
//
//        System.out.println(combinedList);
//
//        // ~~~~~~~~~~~~~~~~~~~~ INTERLEAVE ~~~~~~~~~~~~~~~~~~~~
    }

}
