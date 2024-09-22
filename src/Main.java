import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Citys> citys = new LinkedList<>();

        // adding elements to linked list
        citys.add(new Citys("Berlin", 582));
        citys.add(new Citys("Gothenburg", 0));
        citys.add(new Citys("Madrid", 2222));
        citys.add(new Citys("Paris", 1161));
        citys.add(new Citys("Rom", 1755));
        citys.add(new Citys("Oslo", 251));
        citys.add(new Citys("Warsaw", 838));
        citys.sort(Comparator.comparingInt(Citys::getDistanceFromGbInKm));


        // using string class
        String s = "";

        // using iterator for traversing a linked list
        Iterator<Citys> itr = citys.iterator();

        while (itr.hasNext()) {
            // appending string using "+" operator
            s = s + itr.next() + "\n";
        }

        // Displaying output
        System.out.println(s);






    }
}
