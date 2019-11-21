public class MultiColoredFur extends CreatureDecorator{
	Creature creature;
	String trait;

	public MultiColoredFur(Creature newCreature){
		creature = newCreature;
		this.trait = "Multi-colored Fur";
	}

	public String getTrait(){
		return this.trait;
	}

	@Override
	public String getTraits() {
		return this.creature.getTraits() + "|" + this.trait;
	}
}