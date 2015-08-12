import java.util.Scanner;
/**
 * write a program called PrintDayInWord, which prints “Sunday”, “Monday”, ... “Saturday”
 * if the int variable "day" is 1, ..., 7, respectively.
 * Otherwise, it shall print “Not a valid day”.
 */
public class PrintDayInWord{
    public static void main(String[] args){
        //sd switch-case
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ngay tu 1-->7 : ");
        int ngay= scan.nextInt();
        
        switch(ngay){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("other !");
                     
           
        }
    }
}
