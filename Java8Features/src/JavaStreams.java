import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
	public static void main(String[] args) throws IOException {
//		System.err.println("JavaStreams.main()" + IntStream.range(1, 10).average());
//		System.err.println("JavaStreams.main()" + IntStream.range(1, 10).count());
//		System.err.println("JavaStreams.main()" + IntStream.range(1, 10).sum());
//		IntStream.range(1, 10).forEach(System.out::println);
//		IntStream.range(1, 10).skip(5).forEach(System.out::println);
//		System.err.println("JavaStreams.main()" + IntStream.range(1, 10).max());
//		System.err.println("JavaStreams.main()" + IntStream.range(1, 10).min());
//		System.err.println("JavaStreams.main()" + IntStream.range(1, 10).min());

//		Stream.of("Zamobie","Vinay","Bhaskar","Kanchi").sorted().findAny().ifPresent(System.out::println);
//		Stream.of("Zamobie","Vinay","Bhaskar","Kanchi").sorted().findFirst().ifPresent(System.out::println);
//		Stream.of("Zamobie","Vinay","Bhaskar","Kanchi").filter(x -> x.startsWith("K")).sorted().forEach(System.out::println);
		
//		String[] names={"Zamobie","Vinay","Bhaskar","Kanchi"};
//		Arrays.stream(names).filter(x -> x.startsWith("V")).forEach(System.out::println);
		
//		String[] names={"Zamobie","Vinay","Bhaskar","Vanchi"};
//		Arrays.stream(names).filter(x -> x.startsWith("V")).sorted().forEach(System.out::println);
		
//		Integer[] values= {2,5,9,4,8,7,1,3,6};
//		long count = Arrays.stream(values).map(x -> x).count();
//		System.out.println("JavaStreams.main()"+count);
		
//		Arrays.stream(new int[] {5}).map(x -> x*x).average().ifPresent(System.out::println);
		
//		Stream<String> bands=Files.lines(Paths.get("F://abcd.txt"));	
//		bands.sorted().filter(x -> x.length()>12).forEach(System.out::println);
//		bands.close();
//		
//		Stream<String> bands=Files.lines(Paths.get("F://abcd.txt"));	
//		bands.filter(x -> x.contains("f")).collect(Collectors.toList()).forEach(System.out::println);
//		bands.close();

		IntSummaryStatistics reduce = IntStream.of(5,9,4,8,7,1,3,6).summaryStatistics();
		System.out.println("JavaStreams.main()"+reduce);
		
		
		
	}
}
