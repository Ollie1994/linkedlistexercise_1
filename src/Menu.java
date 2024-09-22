import java.util.Scanner;

public class Menu {


    public int menu () {

        Scanner sc = new Scanner(System.in);
        System.out.println("Available actions!");
        System.out.println("0. To shutdown!");
        System.out.println("1. To add item(s) to list  (comma delimited list)");
        System.out.println("2. To remove any items (comma delimited list)");
        System.out.println("Enter the number for which action you want to take");
        return sc.nextInt();
    }
//-------------------------------------------------------------------------------------







}
