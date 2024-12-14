package weapon_game_project;
import java.util.Scanner;
public class Game {
	
	Game(){
		System.out.println("====Game has Started====");
	}
	
	public   Weapon    selectWeapon() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Score: ");
		int score=sc.nextInt();
		if(score<=400) {
			System.out.println("You got Knife");
			Knife k=new Knife();
		return k;
		}
		else if(score<=800) {
			System.out.println("Press 1 to select Knife");
			System.out.println("Press 2 to select Gun");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("You got Knife");
				Knife k=new Knife();
			return k;
			}
			else if(choice==2) {
				System.out.println("You got Gun");
				Gun g=new Gun();
			return g;
			}
			else {
				System.out.println("Not a Valid Choice");
				return selectWeapon();
			}
		}
		else {
			System.out.println("Press 1 to select Knife");
			System.out.println("Press 2 to select Gun");
			System.out.println("Press 3 to select Bomb");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("You got Knife");
				Knife k=new Knife();
			return k;
			}
			else if(choice==2) {
				System.out.println("You got Gun");
				Gun g=new Gun();
			return g;
			}
			else if(choice==3) {
				System.out.println("You got Bomb");
				Bomb b=new Bomb();
			return b;
			}
			else {
				System.out.println("Not a Valid Choice");
				return selectWeapon();
			}
		}
	}
}
