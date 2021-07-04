import java.text.ParseException;
import java.util.Scanner;

public class First {
    public static void main(String[] args) throws ParseException {
        Task1 task = new Task1();
        Scanner sc = new Scanner(System.in);
        Boolean flag = false;
        while(!flag){
            task.input();
            task.display();
            System.out.println("Enter 0 to exit program or anything else to enter details again");
            char exitCode = sc.next().charAt(0);
            if(exitCode == '0'){
                System.out.println("Exiting program...");
                flag = true;
                System.exit(0);
            }
        }

    }
}
