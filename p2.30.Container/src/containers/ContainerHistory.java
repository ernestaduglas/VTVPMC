package containers;

import java.util.ArrayList;

public class ContainerHistory {
	private ArrayList<Double> history;

	public ContainerHistory() {
		this.history = new ArrayList<Double>();

	}

	public void add(double situation) {
		this.history.add(situation);

	}

	public void reset() {
		this.history.clear();
	}

	public String toString() {
		return this.history.toString();
	}

	public double maxValue() {
		double max = 0.0;
		if (this.history.isEmpty()) {
			return 0.0;
		} else {
			for (int i = 0; i < this.history.size(); i++) {
				max = Math.max(max, this.history.get(i));
			}
			return max;

		}
	}

	public double minValue() {
		double min = maxValue();
		if (this.history.isEmpty()) {
			return 0.0;
		} else {
			for (int i = 0; i < this.history.size(); i++) {
				min = Math.min(min, this.history.get(i));
			}
			return min;
		}
	}

	public double average() {
		double sum = 0;
		if (this.history.isEmpty()) {
			return 0.0;
		} else {
			for (int i = 0; i < this.history.size(); i++) {
				sum += this.history.get(i);
			}
			return sum / this.history.size();
		}
	}

	public double greatestFluctuation() {
		double greatestFluctuation = 0.0;
		ArrayList<Double> fluctuation = new ArrayList<Double>();
		if (this.history.size() < 2) {
			return 0.0;
		} else {
			for (int i = 0; i < this.history.size(); i++) {
				if (i < (this.history.size() - 1)) {
					greatestFluctuation = Math.abs(this.history.get(i + 1) - this.history.get(i));
					fluctuation.add(greatestFluctuation);
				} else {
					greatestFluctuation = Math.abs(this.history.get(i) - this.history.get(i - 1));
					fluctuation.add(greatestFluctuation);
				}

			}
			for (int i = 0; i < fluctuation.size(); i++) {
				greatestFluctuation = Math.max(greatestFluctuation, fluctuation.get(i));
			}
			return greatestFluctuation;
		}
	}

	public double variance() {
		double sumVariance = 0.0;
		if (this.history.size() < 2) {
			return 0.0;
		} else {
			for (int i = 0; i < this.history.size(); i++) {
				sumVariance += Math.pow((this.history.get(i) - average()), 2);
			}
			return sumVariance / (this.history.size() - 1);

		}

	}
}
