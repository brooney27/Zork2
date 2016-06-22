
public class Room {
	private int money;
	private String name;
	private String description;
	private String item;
	private int[] goesTo = { -1, -1, -1, -1 };
	private boolean visited;

	public Room(int money, String name, String description, String item,int[]goesTo) {
		this.money = money;
		this.name = name;
		this.description = description;
		this.item = item;
		for(int i = 0 ; i < 4; i++){
			this.goesTo[i]=goesTo[i];
		}
		this.visited=false;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int m) {
		money = m;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getItem() {
		return item;
	}
	public void takeItem() {
		item = "";
	}

	public int getNorth() {
		return goesTo[0];
	}

	public int getEast() {
		return goesTo[1];
	}

	public int getSouth() {
		return goesTo[2];
	}

	public int getWest() {
		return goesTo[3];
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
}
