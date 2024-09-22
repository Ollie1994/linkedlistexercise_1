import java.util.*;

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
                case 0: // EXIT
                    System.out.println("Goodbye!");
                    return;
                case 1: // ADD CITYS
                    String addCity = returnString.returnCityName();
                    int addDistance = returnInt.returnDistanceFromGb();
                    if (dupeSorter.contains(addCity)) {
                        System.out.println("Unable to add: " + addCity + ", because it already exists in the list");
                    }
                    else {
                        dupeSorter.add(addCity);
                        citys.add(new Citys(addCity, addDistance));
                    }
                    break;
                case 2: // FORWARD/BACKWARDS
                    while (true) {
                        System.out.println("Do you want to go backwards(false) or forwards(true)? ");
                        boolean answer = sc.nextBoolean();
                       Citys location = null;
                       Citys forward;
                        if (answer) {
                            System.out.println("How many step do you want to got forward with?");
                           int input = sc.nextInt();
                            for (int i = 0; i < input; i++) {
                                ListIterator<Citys> iterator = citys.listIterator();
                                forward = iterator.next();
                                location = forward;
                                System.out.println("You are here " + location);
                            }
                        } else if (false) {
                          /* ListIterator<Citys> listIterator = citys.listIterator();
                          Citys backwards = listIterator.previous();
                          location = listIterator.previous();
                            System.out.println(location); */
                        } else {
                            break;
                        }


                    }

                case 3: // LIST LIST
                    citys.sort(Comparator.comparingInt(Citys::getDistanceFromGbInKm));
                    String s = "";
                    Iterator<Citys> itr = citys.iterator();
                    while (itr.hasNext()) {
                        s = s + itr.next() + "\n";
                    }
                    System.out.println(s);


            }
           /*
           citys.sort(Comparator.comparingInt(Citys::getDistanceFromGbInKm));
            String s = "";
            Iterator<Citys> itr = citys.iterator();
            while (itr.hasNext()) {
                s = s + itr.next() + "\n";
            }
            System.out.println(s); */
        }




    }
}










