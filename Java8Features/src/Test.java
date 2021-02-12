import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {  
		Map<Integer, String> hmap = new HashMap<Integer, String>();
	      hmap.put(1, "Monkey");
	      hmap.put(2, "Dog"); 
	      hmap.put(3, "Cat");  
	      hmap.put(4, "Lion");   
	      hmap.put(5, "Tiger");   
	      hmap.put(6, "Bear");
	      /* forEach to iterate and display each key and value pair
	       * of HashMap.    
	       */  
	      hmap.forEach((key,value)->System.out.println(key+" - "+value));
	      /* forEach to iterate a Map and display the value of a particular  
	       * key     
	       */ 
	      hmap.forEach((key,value)->{ 
	         if(key == 4){ 
	            System.out.println("Value associated with key 4 is: "+value); 
	         }  
	      });    
	      /* forEach to iterate a Map and display the key associated with a
	       * particular value     
	       */
	      hmap.forEach((key,value)->{
	         if("Cat".equals(value)){ 
	            System.out.println("Key associated with Value Cat is: "+key);
	         }
	      }); 
	      
	      List<String> names = new ArrayList<String>();
	      names.add("Maggie");
	      names.add("Michonne");
	      names.add("Rick");
	      names.add("Merle");
	      names.add("Governor");
	      //creating stream 
	      //filtering names that starts with M
	      //displaying the stream using forEach  
	      names.forEach(System.out::println);
	      names.stream().filter(f -> f.startsWith("M") ).forEach(System.out::println);


	      
	      
	      
	      
	    //forEach - the output would be in any order
	      System.err.println("Print using forEach");
	      names.stream() 
	     .filter(f->f.startsWith("M"))
	     .sequential()
	     .forEach(n->System.out.println(n)); 

	     /* forEachOrdered - the output would always be in this order: 
	      * Maggie, Michonne, Merle 
	      */ 
	     System.err.println("Print using forEachOrdered"); 
	     names.stream()  
	     .filter(f->f.startsWith("M"))  
	     .parallel() 
	     .forEachOrdered(n->System.out.println(n));
	      
	     	     
	     
	     List<String> names1 = Arrays.asList("Alex", "Brian", "Charles");
	     
	     Consumer<String> makeUpperCase =new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t.toUpperCase());
			}
		      
		};
	     names1.forEach(makeUpperCase);  	
	      
	     IntStream.range(1, 10).forEach(System.out::println);
	     System.err.println("-------------------------------");
	     IntStream.range(1, 10).skip(5).forEach(System.out::println);
	     System.err.println("-------------------------------");
	     System.err.println(IntStream.range(1, 11).sum());
	     
	     Stream.of("Bhaskar","Vinay","Saujith").sorted().findFirst().ifPresent(System.out::println);
	     
	     
	     System.err.println(IntStream.range(1, 11).average());
	     
	     
	     
	     
	     
	     
	     
	     
	   }

	
	
	
	
	
}  