package collections_framwork;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(3);
        list.add(4);
        list.addFirst(1);
        list.addLast(5);
        System.out.println(list);
        Vector<Integer> vec = new Vector<>();
        vec.add(4);
        vec.add(6);
       boolean ans;
        if (vec.contains(6)) ans = true;
        else ans = false;

        System.out.println(ans);
        System.out.println(vec);

        Stack<Integer> sc = new Stack<>();
        sc.add(45);
        sc.add(56);
        sc.push(566);
        int data = sc.peek();
        System.out.println(data);
        System.out.println(sc);
        sc.pop();
        System.out.println(sc);


    }

}



