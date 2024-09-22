import java.util.Scanner;

public class Menu {
//MenuAddRemove menuAddRemove = new MenuAddRemove();
ReturnString returnString = new ReturnString();
ReturnInt returnInt = new ReturnInt();



    //-----------------METHODS___________________________________________________
    public int menuAddRemove () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available actions!");
        System.out.println("0. To shutdown!");
        System.out.println("1. To add item(s) to list");
        System.out.println("2. To remove any items");
        System.out.println("Enter the number for which action you want to take");
        int choice = sc.nextInt();
        return choice;
    }
//-------------------------------------------------------------------------------------







}
