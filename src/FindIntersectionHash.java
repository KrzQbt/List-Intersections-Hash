import java.util.*;


public class FindIntersectionHash {
    public static void main(String[] args) {

        // Populating arrays randomly
        Random rand = new Random();
        int aSize = rand.nextInt(50);
        int bSize = rand.nextInt(50);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> intersection = new LinkedList<>();

        for (int n =0; n< aSize; n++){
            a.add(rand.nextInt(100));
        }
        for (int n =0; n< bSize; n++){
            b.add(rand.nextInt(100));
        }


        Hashtable<Integer,Integer> ht = new Hashtable<>();


        // inserting the longer list into hashTable
        for (int n =0; n <aSize; n++)
            ht.put(a.get(n),a.get(n));

        // checking for duplicate hashes
        for (int n =0; n<bSize; n++){
            if ( ht.get(b.get(n)) != null )
                intersection.add(b.get(n));

        }

        // printing the intersections
        intersection.forEach(integer -> System.out.print(integer+" "));

    }
}
