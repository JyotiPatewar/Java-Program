//program 3
//Array list me aage 1 baar me bhot saare elements add krna using Collections.addAll() method 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ColArrayListEx3 {
public static void main(String[] args) {
ArrayList<String> l1 = new ArrayList<>(Arrays.asList("Apple","Kiwi","Mango","Papaya"));    
ArrayList<String> l2 = new ArrayList<>(Arrays.asList("Pratik","Vinayak","Lalit"));

Collections.addAll(l2,"k,j,u");
System.out.println(l2);



System.out.println(l1.equals(l2));

}    
}







//using equal() method
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ColArrayListEx3 {
public static void main(String[] args) {
ArrayList<String> l1 = new ArrayList<>(Arrays.asList("Apple","Kiwi","Mango","Papaya"));    
ArrayList<String> l2 = new ArrayList<>(Arrays.asList("Apple","Kiwi","Mango","Papaya"));

System.out.println(l1.equals(l2)); 

}    
}*/





//program 3
//using equal() method
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ColArrayListEx3 {
public static void main(String[] args) {
ArrayList<String> l1 = new ArrayList<>(Arrays.asList("apple","kiwi","Mango","Papaya"));    
ArrayList<String> l2 = new ArrayList<>(Arrays.asList("Apple","Kiwi","mango","Papaya"));

System.out.println(l1.equals(l2)); 

}    
}*/
