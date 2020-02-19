import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::valueOf).collect(Collectors.toList());

        System.out.println(findMinElement.apply(numbers));


    }

    private static Function<List<Integer>, Integer> findMinElement = integers -> {
        int minNumber = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) <= minNumber) {
                minNumber = integers.get(i);
                index = i;
            }
        }
        return index;
    };
}
