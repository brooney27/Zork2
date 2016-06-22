import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Play {
    
	public static void go(ArrayList<Room> house,Player p){
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		
		int badGuy = rand.nextInt(house.size())+1;
		System.err.println("Dave is in room "+badGuy);
		boolean mean=(rand.nextInt(2)==0);
		if(mean){
			System.err.println("Dave is mean");
		}else System.err.println("Dave is nice");
		int lamp = rand.nextInt(house.size())+1;
		System.err.println("Lamp is in room "+lamp);
		boolean found = false;
		
		// move loop
		while (p.getLocation() != -2) {
			int room=p.getLocation();
			// secret room roll
			if (room == 6) {
				if (rand.nextInt(4) == 0) {
					found = true;
				}
			}

			Room curr = house.get(room - 1);
			System.out.println(curr.getDescription());
			curr.setVisited(true);

			// collect money
			p.setMoney(p.getMoney()+curr.getMoney()); 
			curr.setMoney(0);

			// check bad guy
			if (room == badGuy) {
				if(mean){
				p.setMoney(0);
				System.out.println("You ran into Mean Dave!!"
						+ " and he stole all your cash!!");
				}
				else{
					System.out.println("You ran into Nice Dave!! He doubles your money!!");
					p.setMoney(p.getMoney()*2);
				}
				badGuy=-1;
			}

			// check lamp
			if (room == lamp) {
				System.out.println("You see a lamp on the floor.");
			} else if (lamp == -1 && !curr.getItem().equals("")) {
				System.out.println("The lamp reveals " + curr.getItem());
			}
			
			//Dungeon
			if(room==9){
				System.out.println("You are trapped!");
				System.out.println("You must answer a riddle to leave."
						+ "\n How many toes has a three-toed sloth?");
			}
			// move choices
			System.out.println("What will you do?");
			String choice = in.nextLine();
			if (choice.equals("move")) {
				p.setSteps(p.getSteps()+1);
				room = Move.go(curr, found, room);
				p.setLocation(room);
			} else if (room == lamp && choice.equals("take lamp")) {
				lamp = -1;
				System.out.println("You take the lamp with you");
				p.addItem("You found the Lamp in the "+curr.getName());
				found=true;
			} else if (choice.equals("get Gift Card") && !curr.getItem().equals("") && room == 5 && lamp == -1) {
				System.out.println("You take the Gift Card");
				curr.takeItem();
				p.addItem("You found the Gift Card in the "+curr.getName());
			} else if (choice.equals("take tickets") && !curr.getItem().equals("") && room == 7 && lamp == -1) {
				System.out.println("You take the tickets");
				curr.takeItem();
				p.addItem("You found the tickets in the "+curr.getName());
			}else if (choice.equals("history")) {
				Command.printHistory(house, p);
			}
			else if(room==9&&choice.equals("12")){
				System.out.println("You have escaped the dungeon");
				room =4;
				p.setLocation(room);
			}else System.out.println("I dont understand you");
     }
	}
}
