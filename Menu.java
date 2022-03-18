import java.util.*;
class PersonChoice{
	 Scanner in=new Scanner(System.in);
	void dataPack() {
		System.out.println("RS: 198  1 gb/day 56 days ");
		System.out.println("RS: 399  2 gb/day 84 days");
		System.out.println("RS: 599  1 gb/day 56 days");
		System.out.println("RS: 1299  2 gb/day 365 days\n");
		System.out.println("Press 9 to Back");
		int select=in.nextInt();
		
	}
	void messagePack() {
		System.out.println("RS: 120 100 SMS/day 30 days");
		System.out.println("RS: 200 100 SMS/day 58 days");
		System.out.println("RS: 360 100 SMS/day 120 days");
		System.out.println("RS: 600 100 SMS/day 365 days\n");
		System.out.println("Press 9 to Back");
		int select=in.nextInt();
	}
	void comboPack() {
		System.out.println("Rs: 245 100 SMS/day, 1.5 gb/day, Unlimited calls, 28 days");
		System.out.println("Rs: 499 100 SMS/day, 1.5 gb/day, Unlimited calls, 56 days");
		System.out.println("Rs: 710 100 SMS/day, 1.5 gb/day, Unlimited calls, 84 days");
		System.out.println("Rs: 1500 100 SMS/day, 1.5 gb/day, Unlimited calls, 136 days\n");
		System.out.println("Press 9 to Back");
		int select=in.nextInt();
	}
	void rateCutter() {
		System.out.println("Rs: 200 30ps/1 min 84 days");
		System.out.println("Rs: 400 30ps/1 min 160 days");
		System.out.println("Rs: 800 30ps/1 min 240 days");
		System.out.println("Rs: 1400 30ps/1 min 480 days\n");
		
		System.out.println("Press 9 to Back");
		int select=in.nextInt();
		
	}
	void englishLanguage() {
		while(true) {
		System.out.println("Press 1 to Data Pack");
		System.out.println("Press 2 to Message Pack");
		System.out.println("Press 3 to Combo Pack");
		System.out.println("Press 4 to Rate Cutter");
		System.out.println("Press 9 to Back");
		int select=in.nextInt();
			switch(select) {
			case 1:
				dataPack();
				break;
			
			case 2:
				messagePack();
				break;
			case 3:
				comboPack();
				break;
			case 4:
				rateCutter();
				break;
			case 9:
				return;
			default:
				System.out.println("Invalide input");
		}
		}
	}
	void tamilLanguage() {
		System.out.println("Sorry I don't known Tamil Please press 9 to go back");
		int select=in.nextInt();
		if(select==9)return;
	}
	void hindiLanguage() {
		System.out.println("Sorry I don't known Hindi Please press 9 to go back");
		int select=in.nextInt();
		if(select==9)return;

	}
}
public class Menu {
	
	
	public static void main(String[] args) {
		PersonChoice Choice=new PersonChoice();
		 Scanner in=new Scanner(System.in);
		 while(true) {
		System.out.println("****************************************Main menu***********************************");
		System.out.println("Press 1 to English");
		System.out.println("Press 2 to Tamil");
		System.out.println("Press 3 to Hindi");
		System.out.println("Press 4 to exit");
		System.out.println("************************************************************************************");
		int select=in.nextInt();
	switch(select) {
	case 1:
		Choice.englishLanguage();
		break;
	case 2:
		Choice.tamilLanguage();
		break;
	case 3:
		Choice.hindiLanguage();
		break;
	case 4:
		System.exit(0);
	default: 
		System.out.println("Invalide input");
	}
		 }

	}

}
