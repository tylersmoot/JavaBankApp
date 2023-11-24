import java.util.Scanner;

public class BankApp {

public static String name = "Tyler";
public static double checkingBalance = 2000d;

// public static String password = "1234";
// public static String username = "Tyler";

   BankApp (String username, String password) {
    
    while(true) {
     System.out.println("Please Login: ");
     System.out.println("Username: ");

     Scanner uName = new Scanner(System.in);
     String newUName = uName.nextLine();
      

     if(newUName.equals(username)) {
        System.out.println("Username Correct");

        System.out.println("Password: ");
        Scanner pass = new Scanner(System.in);
        String newPass = pass.nextLine();

        if(newPass.equals(password)) {

        System.out.println("Password Correct");
        break;
        
        } 

        else {
            System.out.println("incorrect");
            continue;
        }
    
       
     } 

   }
}



   

public static void main(String[] args) {

    BankApp SwingApp = new BankApp("Tyler", "1234");
    
while(true) {
System.out.println("Welcome to your bank" + " " + name + "!");
System.out.println("Please choose from the following options: ");

System.out.println("1 - Deposit Money");
System.out.println("2 - Withdraw Money");
System.out.println("3 - Check Balance");
System.out.println("4 - Cancel");


System.out.println("Enter a choice: ");

Scanner choice = new Scanner(System.in);
int newChoice = choice.nextInt();



if(newChoice == 1) {

    System.out.println("Enter Deposit Amount: ");

    Scanner amount = new Scanner(System.in);
    double newAmount = amount.nextDouble();
    checkingBalance = checkingBalance + newAmount;

    System.out.println("Congratulations" + " " + name + " " + "You deposited" + " " + "$" + newAmount + " " + "to your checking account!");
    continue;
    
}
if(newChoice == 2) {
    
    System.out.println("Your balance is: " + " " + checkingBalance);
    System.out.println("Enter Withdraw Amount: ");

    Scanner withdraw = new Scanner(System.in);
    double newWithdraw = withdraw.nextDouble();
    checkingBalance = checkingBalance - newWithdraw;

    System.out.println("You withdrew" + " " + "$" + newWithdraw + " " + "from your checking account!");
    System.out.println("Bank Balance: " + " " + checkingBalance);
    continue;

}
if(newChoice == 3) {

    System.out.println("Checking Account Balance: " + " " + "$" + checkingBalance);
    continue;
}
if(newChoice == 4) {

   break;
}
}

}
}

