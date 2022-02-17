import java.util.Scanner;
public class Weeakend {

	public static void main(String[] args) {
	Scanner leave=new Scanner(System.in);
	int	numb=leave.nextInt();
     String day[] = {"Sunday", "Monday", "Tuesdy", "Wednesday", "Thurday", "Friday", "Saturday"};
	 for(int i=1; i<=7; i++) {
		 if(i==numb) {
			 System.out.println("The wekend is " + day[i-1]);
			 
			 }
		 
	 }
	
	

	}

}
