import java.util.Collections;
import java.util.ArrayList;

public class Game {

	public static void main(String[] args) {
		ArrayList<Room> house = new ArrayList<Room>();
		
		house = RoomInit.init(house);
		Player p=new Player(0,0,1);
		Play.go(house,p);
		
	}

}
