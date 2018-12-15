package jUnit;

public class JUnitExample {

	public boolean compareString(String first, String second) {

		if(first.equalsIgnoreCase(second)) {

			return true;

		}

		else {

			return false;
		}

	}

	public String concatString(String first, String second) {

		return first.concat(second);
	}


	public int [] addOneToArray(int [] numbers) {
		int length = numbers.length;
		int output[] = new int[length];
		for (int i = 0 ;i< length ; i++) {
			output[i] = numbers[i]+1;		}


		return output;
	}

}