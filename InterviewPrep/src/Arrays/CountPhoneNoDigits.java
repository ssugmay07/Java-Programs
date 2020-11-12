package Arrays;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountPhoneNoDigits {

	public static HashMap<Character,Integer> countOccurances(long[] phoneNumber) {
		String Phonenumbers = "";
		HashMap<Character, Integer> PhonenoMap = new HashMap<Character, Integer>();
		for (int i = 0; i < phoneNumber.length; i++) {
			Phonenumbers = Long.toString(phoneNumber[i]);

			char phonenos[] = Phonenumbers.toCharArray();

			//HashMap<Character, Integer> PhonenoMap = new HashMap<Character, Integer>();

			for (Character temp : phonenos) {
				if (PhonenoMap.containsKey(temp)) {
					PhonenoMap.put(temp, PhonenoMap.get(temp) + 1);
				} else
					PhonenoMap.put(temp, 1);

			}
		}

		//System.out.println(PhonenoMap);
		//Set<Entry<Character, Integer>> set = PhonenoMap.entrySet();

		return PhonenoMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long PhoneNumber[] = new long[10];

		PhoneNumber[0] = 4086804925l;
		PhoneNumber[1] = 4086804915l;
		PhoneNumber[2] = 4086804925l;
		PhoneNumber[3] = 4086804925l;
		PhoneNumber[4] = 4086804925l;
		PhoneNumber[5] = 4086804925l;
		PhoneNumber[6] = 4086804925l;
		PhoneNumber[7] = 4086837925l;
		PhoneNumber[8] = 4086804925l;
		PhoneNumber[9] = 4086804925l;

		HashMap<Character,Integer>Resultmap=new HashMap<Character,Integer>();
		Resultmap=countOccurances(PhoneNumber);
		
		System.out.println(Resultmap);
	}

}
