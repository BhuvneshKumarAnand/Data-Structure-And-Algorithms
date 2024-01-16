package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(10);
//        System.out.println(arr.size());
//        System.out.println(arr.get(2));
//        arr.add(1,8);
//        System.out.println(arr.get(2));
//        System.out.println(arr.get(1));
//        arr.set(1,8);
//        Integer j=8;
//        arr.remove(j);
//        arr.remove(j);


        for (int i=0;i< arr.size();i++){
            System.out.println(arr.get(i));
        }

        //Enhanced for loop
        for (int i : arr){
            System.out.println(i);
        }



//        ArrayList<String> list=new ArrayList<>();
//        list.add( "Ant" );
//        list.add( "Bat" );
//        list.add( "Car" );
//        list.add( "Door" );
//        list.add( "Euro" );
//
////        list.add(2,"Bus");
//        list.set(2,"Bus");
//        System.out.println(list.get(2));
//        System.out.println(list.get(3));

    }
}
