package boxes;

import java.util.ArrayList;


public class OneThingBox extends Box {
	private ArrayList<Thing> box;

	public OneThingBox() {
		this.box = new ArrayList<Thing>(1);
	}

	@Override
	public void add(Thing thing) {
		if (this.box.isEmpty()) {
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
