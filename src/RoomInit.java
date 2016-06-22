import java.util.ArrayList;
import java.util.Random;
public class RoomInit {
			public static ArrayList<Room> init(ArrayList<Room> house){
				
				Random rand = new Random();
				String d = "You are standing in the foyer of an old house."
						+ "\rYou see a dead scorpion.";
				int m=rand.nextInt(999)+1;
				String n="Foyer";
				String i="a spider web made from pure silk ";
				int[] g = {2,-1,-1,-1};
				Room r= new Room(m,n,d,i,g);
				house.add(r);
				
				d = "You are standing in the front room of an old house."
						+ "\rYou see a piano.";
				m=rand.nextInt(999)+1;
				n="Front Room";
				i="the piano has the sheet music for your favorite song";
				g[0]=-1;g[1]=4;g[2]=1;g[3]=3;
				r= new Room(m,n,d,i,g);
				house.add(r);
				
				d = "You are standing in the library of an old house."
						+ "\rYou see spiders.";
				m=rand.nextInt(999)+1;
				n="Library";
				i="a scroll on the wall";
				g[0]=5;g[1]=2;g[2]=-1;g[3]=-1;
				r= new Room(m,n,d,i,g);
				house.add(r);
				
				d = "You are standing in the kitchen of an old house."
						+ "\rYou see bats.";
				m=rand.nextInt(999)+1;
				n="Kitchen";
				i="a refrigerator full of your favorite food/drink";

				g[0]=7;g[1]=-1;g[2]=-1;g[3]=2;
				r= new Room(m,n,d,i,g);
				house.add(r);
				
				d = "You are standing in the dining room of an old house."
						+ "\rYou see dust and empty box.";
				m=rand.nextInt(999)+1;
				n="Dining Room";
				i="the box is not actually empty, it contains an Amazon gift card which you can take if you type \"Get Gift Card\"";

				g[0]=-1;g[1]=-1;g[2]=3;g[3]=-1;
				r= new Room(m,n,d,i,g);
				house.add(r);
				
				d = "You are standing in the vault of an old house."
						+ "\rYou see 3 walking skeletons.";
				m=rand.nextInt(999)+1;
				n="Vault";
				i="";

				g[0]=9;g[1]=7;g[2]=-1;g[3]=-1;
				r= new Room(m,n,d,i,g);
				house.add(r);
				
				d = "You are standing in the parlor of an old house."
						+ "\rYou see treasure chest.";
				m=rand.nextInt(999)+1;
				n="Parlor";
				i="  a portrait of your "
						+ "favorite movie star and tickets to their latest movie which you can take";

				g[0]=-1;g[1]=-1;g[2]=4;g[3]=6;
				r= new Room(m,n,d,i,g);
				house.add(r);
				
				d = "You are standing in the secret room of an old house."
						+ "\rYou see piles of gold.";
				m=rand.nextInt(999)+1;
				n="Secret Room";
				i="a map of the house along with the piles of gold";

				g[0]=-1;g[1]=-1;g[2]=-1;g[3]=6;
				r= new Room(m,n,d,i,g);
				house.add(r);
				
				d = "You are in the dungeon";
				m=rand.nextInt(999)+1;
				n="Dungeon";
				i="";

				g[0]=-1;g[1]=-1;g[2]=-1;g[3]=-1;
				r= new Room(m,n,d,i,g);
				house.add(r);
				
				return house;
			}
}
