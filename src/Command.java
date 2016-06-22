import java.util.Collections;
import java.util.ArrayList;

public class Command {

	public static void printHistory(ArrayList<Room> house, Player p) {
		System.out.println("You have taken " + p.getSteps() + " steps");
		System.out.println("You have "+NumberUtility.asCurrency(p.getMoney())+" money");
		System.out.println(p.printItems());
		for (int i = 0; i < house.size(); i++) {
			Room vis = house.get(i);
			if (vis.isVisited()) {
				System.out.println("You have visited the " + vis.getName());
			}
		
		}
	}
}
