//RemoveIfExample
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ColArrayListEx5 {
public static void main(String[] args) {
List<Integer> numbers = new ArrayList<>();
numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Define a predicate that checks if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Remove all even numbers
        boolean removed = numbers.removeIf(isEven);

        System.out.println("Removed elements: " + removed); // Outputs true if any element was removed
        System.out.println("Updated list: " + numbers);     // Outputs the list after removal
}
}