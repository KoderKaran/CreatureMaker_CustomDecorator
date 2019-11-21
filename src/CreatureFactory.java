import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class CreatureFactory {
	private ArrayList<String> traitList;
	private Scanner scn;

	public CreatureFactory(){
		traitList = new ArrayList<String>(
				Arrays.asList("Fangs", "Fire Breath", "Invisibility",
						"Multi-Colored Fur", "Poison Touch", "Tail", "Wings")
		);
		scn = new Scanner(System.in);
	}

	public ArrayList<String> selector(){
		ArrayList<String> traitsToUse = new ArrayList<String>();
		boolean doneTraits = false;
		System.out.println("Input -1 to exit");
		while(!doneTraits){
			System.out.println("Traits remaining:");
			for(String c: this.traitList){
				System.out.println(c + "-" + this.traitList.indexOf(c));
			}
			int input = scn.nextInt();
			if(this.traitList.size() == 1){
				doneTraits = true;
			}
			if(input == -1){
				doneTraits = true;
			}else{
				try{
					String traitToAdd = this.traitList.get(input);
					traitsToUse.add(traitToAdd);
					this.traitList.remove(input);
				}catch (ArrayIndexOutOfBoundsException e){
					System.out.println("Invalid input, try again!");
				}
			}
		}
		return traitsToUse;
	}

	public CreatureDecorator factory(String trait, Creature creature) {
		if (trait.equals("Fangs")) {
			return new Fangs(creature);
		}
		if (trait.equals("Fire Breath")) {
			return new FireBreath(creature);
		}
		if (trait.equals("Invisibility")) {
			return new Invisibility(creature);
		}
		if (trait.equals("Multi-Colored Fur")) {
			return new MultiColoredFur(creature);
		}
		if (trait.equals("Poison Touch")) {
			return new PoisonTouch(creature);
		}
		if (trait.equals("Tail")) {
			return new Tail(creature);
		}
		if (trait.equals("Wings")) {
			return new Wings(creature);
		}
		return null;
	}
}
