public class Tail extends CreatureDecorator{
	Creature creature;
	String trait;

	public Tail(Creature newCreature){
		creature = newCreature;
		this.trait = "Tail";
	}

	public String getTrait(){
		return this.trait;
	}

	@Override
	public String getTraits() {
		return this.creature.getTraits() + this.trait + "|";
	}
}