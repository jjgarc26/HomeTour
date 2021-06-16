package fixtures;

public class Room extends Fixture{
	
	public Room() {
	}
	
	//exits 
	public String[] getExits = new String[] {"left", "right"};
	

	public String getLeftExits() {
		return getExits[0];
		
	}
	public String getRightExits() {
		return getExits[1];
	}
	
	public void setLeftExit(String direction) {
		direction = getExits[0];
	}
	public void setRightExit(String direction) {
		direction = getExits[1];
	}
}
