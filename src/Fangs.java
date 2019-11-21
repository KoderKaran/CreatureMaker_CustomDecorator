public class Fangs extends CreatureDecorator{
	Creature creature;
	String trait;

	public Fangs(Creature newCreature){
		creature = newCreature;
		this.trait = "Fangs";
	}

	public String getTrait(){
		return this.trait;
	}

	@Override
	public String getTraits() {
		return this.creature.getTraits() + this.trait + "|";
	}
}
