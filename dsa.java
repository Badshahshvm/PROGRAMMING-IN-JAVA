import java.util.ArrayList;
import java.util.Scanner;

public class dsa {

    public static void main(String[] args)
    {
        Scanner x=new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("grapes");
        list.add("papaya");
        System.out.println(list);
        String elements=list.get(3);
        System.out.println(elements);//get elements at any index
        //delete elements at any index:-
        list.remove(2);
        System.out.println(list);
        //set the element at any index;
        list.set(2,"carrot");
        System.out.println(list);
    }
}
