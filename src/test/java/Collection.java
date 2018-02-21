import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {
        int[] a = {5, 6, 2, 7};
        System.out.println(a[0]);
        a[3]=3;

        System.out.println(a.length);

        ArrayList<Integer> alist = new ArrayList<Integer>(10);

        for (int i=0;i<11;i++){
            alist.add(i);
        }
        for (int i=0;i<alist.size();i++){
            System.out.println("print");
            System.out.println(alist.get(i));
        }

        Iterator<Integer> itr = alist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        HashSet<String> hSet = new HashSet<String>();
        hSet.add("Simon");
        hSet.add("Assel");
        hSet.add("Simon");


        Iterator<String> itrs = hSet.iterator();
        while (itrs.hasNext()){
            System.out.println(itrs.next());
        }
    }
}
