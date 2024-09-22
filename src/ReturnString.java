import java.util.Scanner;

public class ReturnString {
    Citys citys = new Citys("", 0);

    public String returnCityName () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in city");
        String cityToBeAdded = sc.next();

        return cityToBeAdded;
    }
}
