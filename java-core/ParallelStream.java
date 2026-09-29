import java.util.List;

public class ParallelStream {
       public static void main(String[] args) {
        List<String> words = List.of("Java", "Stream", "Parallel", "API", "Core");

        int totalLength = words.parallelStream()
                                .mapToInt(String::length)
                                .sum();

        System.out.println("Total length: " + totalLength);
    }

}
