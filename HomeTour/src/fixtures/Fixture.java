package fixtures;

public class Fixture {
	
	private String name = "Some Room";
	
	public Fixture() {}
	
	public Fixture (String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;

	}
	public String shortDescription;
	
	public String getshortDescription() {
		return shortDescription;
	}
	public void setshortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public String longDescription;
	
	public String getlongDescription() {
		return longDescription;
	}
	
	public void setLongDescription() {
		this.longDescription = longDescription;
	}
	
	}




	



