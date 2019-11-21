import java.util.ArrayList;
import java.util.Scanner;
public class CreatureMaker {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Pick a name for your creature:");
		String name = scn.next();
		Creature creature = new BaseCreature();
		CreatureFactory factory = new CreatureFactory();
		ArrayList<String> traitList = factory.selector();
		for(int i=0; i<traitList.size(); i++){
			creature = factory.factory(traitList.get(i), creature);
		}
		System.out.println(name + "'s traits:");
		System.out.println(creature.getTraits());
	}
}
