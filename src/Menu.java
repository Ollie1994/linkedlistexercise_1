import java.util.Scanner;

public class Menu {
ReturnString returnString = new ReturnString();
ReturnInt returnInt = new ReturnInt();
    //-----------------METHODS___________________________________________________
    public int menuAddRemove () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available actions!");
        System.out.println("0. EXIT!");
        System.out.println("1. To add city(s) to list");
        System.out.println("2. (F)orward/(B)ackwards");
        System.out.println("3. (L)ist Places");
        System.out.println("Enter the number for which action you want to take");
        int choice = sc.nextInt();
        return choice;
    }


//-------------------------------------------------------------------------------------
}
