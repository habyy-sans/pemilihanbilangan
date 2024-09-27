import java.util.Scanner;
public class pemilihanharidenganif16 {
    public static void main (String[] args) {
        Scanner sc00 = new Scanner (System.in); 
        System.out.println("Input day numbers: ");
        int dayNumbers = sc00.nextInt();
        if(dayNumbers >= 1 && dayNumbers <= 5) {
            System.out.println("weekday");
        }else if(dayNumbers == 6 || dayNumbers == 7){
            System.out.println("weekend");
        }else{
            System.out.println("invalid day number");
        }
    }
}
