public class Wings extends CreatureDecorator{
	Creature creature;
	String trait;

	public Wings(Creature newCreature){
		creature = newCreature;
		this.trait = "Wings";
	}

	public String getTrait(){
		return this.trait;
	}

	@Override
	public String getTraits() {
		return this.creature.getTraits() + this.trait + "|";
	}
}