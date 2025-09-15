import java.util.Scanner;
public class NightOut {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("How much does dinner usually cost?");
	double dinner = input.nextDouble();
	System.out.println("How much is laser tag for one person?");
	double laserTag = input.nextDouble();
	System.out.println("How much does a triple scoop cost?");
	double tripleScoop = input.nextDouble();
	dinner = (dinner * 3);
	System.out.println("Dinner: " + dinner);
	laserTag = (laserTag * 2);
	System.out.println("Laser Tag: " + laserTag);
	tripleScoop = (tripleScoop * (4/3));
	System.out.println("Ice Cream: " + tripleScoop);
	double grandTotal = (dinner + laserTag + tripleScoop);
	System.out.println("Grand Total: " + grandTotal);
 }
}
