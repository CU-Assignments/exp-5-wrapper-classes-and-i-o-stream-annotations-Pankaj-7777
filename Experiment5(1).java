import java.util.*;

public class WrapperDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        int sum = 0;
        for (Integer num : numbers) { 
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);

        String intStr = "100";
        String boolStr = "true";

        Integer intValue = Integer.parseInt(intStr);
        Boolean boolValue = Boolean.parseBoolean(boolStr); 

        System.out.println("Parsed Integer: " + intValue);
        System.out.println("Parsed Boolean: " + boolValue);
    }
}
