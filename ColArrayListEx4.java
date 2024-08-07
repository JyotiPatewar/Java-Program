//program 4
//clone method use  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ColArrayListEx4 {
public static void main(String[] args) {
    ArrayList<Integer> alArrayList2 = new ArrayList<>(Arrays.asList(1,2,3,5,6));
   alArrayList2.remove(2);

    ArrayList i = (ArrayList)alArrayList2.clone();
    System.out.println(i);
}    
}





/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class ColArrayListEx4{
public static void main(String[] args) {
ArrayList<Integer> alArrayList2 = new ArrayList<>(Arrays.asList(8,9,2,3,5,6));
    alArrayList2.remove(2);
   ArrayList i = (ArrayList)alArrayList2.clone();
    System.out.println(i);
    alArrayList2.set(0, 0);
    boolean contains = i.contains("Element");
    System.out.println(contains);
    alArrayList2.sort(Comparator.naturalOrder()); //sorting k liye method use
    System.out.println(alArrayList2);
    
}
}*/