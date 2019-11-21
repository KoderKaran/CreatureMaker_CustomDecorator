public abstract class Creature {
	private String traits = "";
	private String name = "";

	public String getTraits(){
		return this.traits;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String newName){
		this.name = newName;
	}

	public void setTraits(String newTrait){
		this.traits = newTrait;
	}

}
