import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        ReturnString returnString = new ReturnString();
        ReturnInt returnInt = new ReturnInt();
        LinkedList<Citys> citys = new LinkedList<>();
        LinkedList<String> dupeSorter = new LinkedList<>();



//----------------------------------------------------------
        while (true) {


            int menuChoice = menu.menuAddRemove();
            switch (menuChoice) {
                case 0:
                    return;
                case 1:
                    String addCity = returnString.returnCityName();
                    int addDistance = returnInt.returnDistanceFromGb();
                    if (dupeSorter.contains(addCity)) {
                        System.out.println("Unable to add: " + addCity);
                        break;
                    }
                    else {
                        dupeSorter.add(addCity);
                        citys.add(new Citys(addCity, addDistance));
                    }
                    break;
                case 2:
                    String removeCity = returnString.returnCityName();
                    int removeDistance = returnInt.returnDistanceFromGb();
                    if (!citys.contains(removeCity)) {
                        System.out.println("Unable to remove: " + removeCity );
                        break;
                    }
                    else {
                        citys.remove(new Citys(removeCity, removeDistance));
                    }
                    break;

            }
            //using string class
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
}






            // adding elements to linked list
           /*citys.add(new Citys("Berlin", 582));
            citys.add(new Citys("Gothenburg", 0));
            citys.add(new Citys("Madrid", 2222));
            citys.add(new Citys("Paris", 1161));
            citys.add(new Citys("Rom", 1755));
            citys.add(new Citys("Oslo", 251));
            citys.add(new Citys("Warsaw", 838));
            citys.sort(Comparator.comparingInt(Citys::getDistanceFromGbInKm));


            using string class
            String s = "";

            // using iterator for traversing a linked list
            Iterator<Citys> itr = citys.iterator();

            while (itr.hasNext()) {
                // appending string using "+" operator
                s = s + itr.next() + "\n";
            }

            // Displaying output
            System.out.println(s);

        */




