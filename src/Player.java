
public class Player {
	private int money = 0;
	private int steps = 0;
	private int location;
	private String inventory;
	public Player(int m,int s, int l){
		money=m;
		steps=s;
		location=l;
		inventory = new String();
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getSteps() {
		return steps;
	}
	public void setSteps(int steps) {
		this.steps = steps;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public void addItem(String item){
		inventory+="\n"+item;
	}
	public String printItems(){
		return inventory;
	}
}
