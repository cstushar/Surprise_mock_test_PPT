
public class Q2 {

	public static int firstUniqChar(String s) {
		int[] frequencyArray = new int[26];

		// Count the frequency of each character
		for (char c : s.toCharArray()) {
			frequencyArray[c - 'a']++;
		}

		// Find the index of the first unique character
		for (int i = 0; i < s.length(); i++) {
			if (frequencyArray[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		 return -1; // No unique character found
	}

	public static void main(String[] args) {

		// Example cases
		System.out.println(firstUniqChar("leetcode")); // Output: 0
		System.out.println(firstUniqChar("loveleetcode")); // Output: 2
		System.out.println(firstUniqChar("aabb")); // Output: -1
	}

}
