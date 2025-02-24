public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray() {
		int[] numArr = new int[5];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
		}
		return numArr;
	}	

	public static String[] createArray(String str1, String str2, String str3, String str4) {
		String[] stringArr = new String[]{str1,str2,str3,str4};
		return stringArr;
	}

	public static int findValue(int num, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;

	}
	public static int findThirdValue(String str, String[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (str.equals(arr[i])) {
				count++;
			}
			if(count >= 3) {
				return i;
			}
		}
		return -1;	
	}
	}


