public class Invisibility extends CreatureDecorator{
	Creature creature;
	String trait;

	public Invisibility(Creature newCreature){
		creature = newCreature;
		this.trait = "Invisibility";
	}

	public String getTrait(){
		return this.trait;
	}

	@Override
	public String getTraits() {
		return this.creature.getTraits() + this.trait + "|";
	}
}
