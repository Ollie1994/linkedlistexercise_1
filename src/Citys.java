// https://www.geeksforgeeks.org/convert-linkedlist-to-string-in-java/

import java.util.Iterator;
import java.util.LinkedList;

public class Citys {


    private String cityName;
    private int distanceFromGbInKm;
    public Citys(String cityName, int distanceFromGbInKm)
    {
        this.cityName = cityName;
        this.distanceFromGbInKm = distanceFromGbInKm;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getDistanceFromGbInKm() {
        return distanceFromGbInKm;
    }
    public void setDistanceFromGbInKm(int distanceFromGbInKm) {
        this.distanceFromGbInKm = distanceFromGbInKm;
    }



    //@Override toString method
    public String toString()
    {
        return "name='" + cityName + '\''  + '\'' + ", ID=" + distanceFromGbInKm;
    }
}

class Main {
    public static void main(String[] args)
    {

        LinkedList<Citys> citys = new LinkedList<>();

        // adding elements to linked list
        citys.add(new Citys("Ridhi", 202199));
        citys.add(new Citys("Ananya", 202195));
        citys.add(new Citys("Ankit", 202192));
        citys.add(new Citys("Suraj", 202147));
        citys.add(new Citys("Sarthak", 202178));
        citys.add(new Citys("Sonika", 202167));
        citys.add(new Citys("Shishya", 202157));

        System.out.println("Using String Class\n");

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









