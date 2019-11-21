public class FireBreath extends CreatureDecorator{
	Creature creature;
	String trait;

	public FireBreath(Creature newCreature){
		creature = newCreature;
		this.trait = "Fire Breath";
	}

	public String getTrait(){
		return this.trait;
	}

	@Override
	public String getTraits() {
		return this.creature.getTraits() + this.trait + "|";
	}
}
