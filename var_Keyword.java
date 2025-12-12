import java.util.HashMap;
import java.util.Map;

public class var_Keyword {
    public static void main(String[] args) {
        
        HashMap<Integer, String> data = new HashMap<>();

        data.put(1, "Ravi");
        data.put(2, "Sunny");
        data.put(3,"hari");
        data.put(4, "Shiva");
        data.put(5, "Ramesh");

 
        // Old method using enhanced for loop
        for(Map.Entry<Integer,String> iter : data.entrySet()){
            System.out.print(iter.getKey() + " : "+iter.getValue() + "  ,  ");
        }

        // using Java 8 for loop
        System.out.println();
        data.forEach((k,v)-> System.out.print(k + " : "+v + "  ,  "));

        // Using var keyword
        System.out.println("Using var keyword :: ");
        for(var iter1 :data.entrySet()){
            System.out.print(iter1.getKey() + " :: "+iter1.getValue() + " , ");
        }


    }
}
