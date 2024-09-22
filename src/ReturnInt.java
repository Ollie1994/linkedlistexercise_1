import java.util.Scanner;

public class ReturnInt {

    Citys citys = new Citys("", 0);

    public int returnDistanceFromGb () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in city");
        int DistanceFromGb = sc.nextInt();

        return returnDistanceFromGb();
    }

}
