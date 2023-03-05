package lesson_17;

import java.util.Arrays;

public interface Iterator {
	boolean hasNext();

	void next();
}

class Collection {
	Number[] arr;

	public Collection(Number[] arr) {
		super();
		this.arr = arr;
	}

	class Forward implements Iterator {
		int count = 0;

		@Override
		public boolean hasNext() {
			return count < arr.length;
		}

		@Override
		public void next() {

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] instanceof Integer && ((Integer) arr[i]) % 2 != 0) {
					arr[i] = 0;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	Forward createForward() {
		return new Forward();
	}

	class Backward implements Iterator {
		int count = arr.length - 1;

		@Override
		public boolean hasNext() {
			return count >= 0;

		}

		@Override
		public void next() {

			for (int i = arr.length - 1; i >= 0; i -= 2) {
				System.out.println(arr[i]);
			}
		}

	}

	Backward createBackward() {
		return new Backward();
	}
}
