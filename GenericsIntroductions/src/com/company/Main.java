package com.company;

import java.util.ArrayList;

public class Main {
//generics allows us to take (type parammeter)
    public static void main(String[] args) {

//        ArrayList items=new ArrayList()  ;//raw type (ArrayList) not goood to use better to <>, and add the parameter type
        ArrayList<Integer>items=new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDouble(items);





    }
    private static void printDouble(ArrayList<Integer> arrayList){
//        for(Object i:arrayList){ //reason we put (Object)is b/c we didn't specifiy wt data on line (9) type the (ArrayList) above is. hmmm bad thing is
//            //that you can add any type of (data) on items above and not get an error during compile time,but will get error in run time
//            System.out.println((Integer)i*2); // we had to (cast) the object b/c we didn't speciy it above.
//        }

        for(int i:arrayList){ //we could keep it as Object but better to declare it
            System.out.println(i*2);
        }
    }
}
