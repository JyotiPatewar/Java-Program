//Collection ArrayList Program 1
//add methods se array ready karna
import java.util.ArrayList;
public class ColArrayListEx1 {
public static void main(String[] args) {
ArrayList<String> l1=new ArrayList<>();
l1.add("java");
l1.add("c++"); 
l1.add("dbms"); 
l1.add("os");
System.out.println(l1);

//Particular index ki value lene k liye use get method
System.out.println(l1.get(2)); 

//Particular index ki value ko change liye use set method
System.out.println(l1.set(0,"Golan" ));  
System.out.println(l1);

l1.add(3,"Tutor");
System.out.println(l1);

System.out.println(l1.remove(2));
System.out.println(l1);

//Contain Method se ptaa chaega ki list me java h yaah nhi ... boolean value return karega true or false
System.out.println(l1.contains("java")); 

//Duplicate set banaa dega
System.out.println(l1.clone());

//hashcode() method se address return hoga.. 
System.out.println(l1.hashCode());

//Size method iski length dekhti h..
for(int i=0;i<l1.size();i++){  
System.out.println(l1.get(i));
}

//For each loop...
for(String s:l1){    
System.out.println(s);
}

//index pr value read krk flse condition me -1 return karega
System.out.println(l1.indexOf("Jaya"));
System.out.println(l1.indexOf("Golan")); //kis index pr word h wo indexno. return karega

//clear method clear set elements
l1.clear();
System.out.println(l1); 

l1.isEmpty();
System.out.println(l1);
}    
}
