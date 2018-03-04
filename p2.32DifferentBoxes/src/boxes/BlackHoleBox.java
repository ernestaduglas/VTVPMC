package boxes;

import java.util.ArrayList;

public class BlackHoleBox extends Box {
	private ArrayList<Thing> box;

	public BlackHoleBox() {
		this.box = new ArrayList<Thing>();
	}

	@Override
	public void add(Thing thing) {
		this.box.add(thing);
	}

	@Override
	public boolean isInTheBox(Thing thing) {
		return false;

	}

}
