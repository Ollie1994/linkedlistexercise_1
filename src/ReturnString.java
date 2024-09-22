import java.util.Scanner;

public class ReturnString {


    public String returnCityName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in city");
        String cityToBeAdded = sc.next();
        return cityToBeAdded;

    }
}

