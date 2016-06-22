import java.util.Scanner;
public class Move {
	private static Scanner in=new Scanner(System.in);
	public static int go(Room room, boolean found, int numb){
		
		while (true){
		System.out.println("Which direction would you like to move?");
		String move=in.nextLine();
		if (move.equals("go north")&&room.getNorth()!=-1){
			return room.getNorth();
		}
		if (move.equals("go south")&&room.getSouth()!=-1){
			return room.getSouth();
		}
		if (move.equals("go east")&&room.getEast()!=-1){
			if(numb!=6||!found){
			return room.getEast();
		 }
			else {
				System.out.println("You have found a secret room."
						+ "\n Would you like to enter?");
				String answer=in.nextLine();
				if(answer.equals("yes")){
					return 8;
				}
				else{
					return room.getEast();
				}
				
			}
		}
		if (move.equals("go west")&&room.getWest()!=-1){
			return room.getWest();
		}
		else{
			System.out.println("You cant go that way");
			}
		}
	}
}