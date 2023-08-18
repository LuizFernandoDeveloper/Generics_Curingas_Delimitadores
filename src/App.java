import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4 , 5);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjects = new ArrayList<>();

        copy(myInts , myObjects);
        printList(myObjects);
        copy(myDoubles, myObjects);
        printList(myObjects);
    }

    public static void copy(List<? extends Number> soucer, List<? super Number> destiny){
        for (Number numbre : soucer){
            destiny.add(numbre);
        }
    }

    public static void printList(List<?> list){
        for (Object obj: list){
            System.out.print(obj + " ");
        }
        System.out.println(); 
    }
}
