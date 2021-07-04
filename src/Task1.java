import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task1 {
    String fullName;
    String username;
    String password;
    String phoneNumber;
    Boolean sendEmail;
    String email;
    String address;
    String contactNumber;
    Date validFrom;
    Date validTill;


    public void input() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the following information: \n FULL NAME: ");
        this.fullName = sc.nextLine();
        System.out.println("USERNAME: ");
        this.username = sc.nextLine();
        System.out.println("PASSWORD: ");
        this.password = sc.nextLine();
        System.out.println("PHONE NUMBER: ");
        this.phoneNumber = sc.nextLine();
        System.out.println("Would you like to receive emails? (Yes/No)");
        String response = sc.nextLine();
        this.sendEmail = response.equalsIgnoreCase("yes");
        System.out.println("EMAIL: ");
        this.email = sc.nextLine();
        System.out.println("ADDRESS: ");
        this.address = sc.nextLine();
        System.out.println("CONTACT NUMBER: ");
        this.contactNumber = sc.nextLine();
        System.out.println("DATE VALID FROM: (dd/mm/yyyy)");
        String date1 = sc.nextLine();
        System.out.println("DATE VALID TILL: (dd/mm/yyyy)");
        String date2 = sc.nextLine();
        this.validFrom = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
        this.validTill = new SimpleDateFormat("dd/MM/yyyy").parse(date2);

    }

    public void display(){
        // NOT DISPLAYING PASSWORD
        System.out.println("*****YOUR DATA*****");
        System.out.println("FULL NAME: " + this.fullName);
        System.out.println("USERNAME: " + this.username);
        System.out.println("PHONE NUMBER: " + this.phoneNumber);
        String sendE = this.sendEmail ? "Yes" : "No";
        System.out.println("SEND EMAIL: " + sendE);
        System.out.println("EMAIL ADDRESS: " + this.email);
        System.out.println("ADDRESS: " + this.address);
        System.out.println("CONTACT NUMBER: " + this.contactNumber);
        System.out.println("VALID FROM: " + this.validFrom);
        System.out.println("VALID TILL: " + this.validTill);

    }


}
