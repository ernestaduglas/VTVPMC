package boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box {
	private int maxWeight;
	private ArrayList<Thing> box;

	public MaxWeightBox(int maxWeight) {
		this.maxWeight = maxWeight;
		this.box = new ArrayList<Thing>();
	}

	@Override
	public void add(Thing thing) {
		int weight = 0;
		for(int i=0; i<this.box.size(); i++) {
			weight+=this.box.get(i).getWeight();
		}
		if (thing.getWeight() <= (this.maxWeight - weight)) {
			this.box.add(thing);
		}

	}

	@Override
	public boolean isInTheBox(Thing thing) {
		if (!this.box.contains(thing)) {
			return false;
		} else {
			return true;
		}

	}

}
