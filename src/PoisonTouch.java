public class PoisonTouch extends CreatureDecorator{
	Creature creature;
	String trait;

	public PoisonTouch(Creature newCreature){
		creature = newCreature;
		this.trait = "Poison Touch";
	}

	public String getTrait(){
		return this.trait;
	}

	@Override
	public String getTraits() {
		return this.creature.getTraits() + this.trait + "|";
	}
}