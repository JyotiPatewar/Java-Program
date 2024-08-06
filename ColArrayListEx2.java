//Program 2 
//Without add method use 1 bar me array list ready krna 
/*import java.util.ArrayList;
import java.util.Arrays;
public class ColArrayListEx2 {
public static void main(String[] args) {
ArrayList<String> l1 = new ArrayList<>(Arrays.asList("Apple","Kiwi","Mango","Papaya"));
System.out.println(l1);
}
    
}*/




 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class ColArrayListEx2 {
public static void main(String[] args) {
    LinkedList<String> l1=new LinkedList<>();
    l1.add("java");
    l1.add("c++");
    l1.add("python");
    l1.add("c#");
    
    System.out.println(l1);
List<String> ob=Collections.unmodifiableList(l1);
//ob.add("UU"); //this line will show Exception bcoz upr line me unmodifiableList method us ki jo isko immutable banati h or neeche hum usme mpdification krre h toh wo support nhi krga or Exception dega
System.out.println(l1);
}
    
} 
