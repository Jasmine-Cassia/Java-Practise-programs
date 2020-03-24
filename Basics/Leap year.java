import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int year;
        boolean isleap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        year = sc.nextInt();
        sc.close();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isleap = true;
                }
                else{
                    isleap = false;
                }
            }
            else{
                isleap = true;
            }
        }
        else{
            isleap = false;
            
        }    
        if (isleap == true) {
            System.out.println("The year "+year+" is a leap year");
        }
        else{
            System.out.println("The year "+year+" is not a leap year");
        }
    }
}
