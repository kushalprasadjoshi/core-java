package chap07advancedconcepts;

import java.util.ArrayList;

public class Eg20JavaGenerics {
    public static void main(String[] args) {

//        ArrayList<int> arrayList = new ArrayList();   // Type Parameter in java generics cannot be a primitive datatype.

        ArrayList<Integer> arrayList = new ArrayList();

        //        arrayList.add("String 1");
        arrayList.add(54);
        arrayList.add(643);
//        arrayList.add(new Scanner(System.in));

//        int a = (int) arrayList.get(2);

        int a = arrayList.get(0);
        System.out.println(a);
    }
}
