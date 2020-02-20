
public class Ejercicio1 {

	public static void main(String[] args) {
		Ejercicio1 ej1 = new Ejercicio1();
		int[] nums = { 3, 8, 2, 1 };
		System.out.println(ej1.tresYDespuesDosYUno(nums));
		int[] nums2 = { 3, 2, 1 };
		System.out.println(ej1.tresYDespuesDosYUno(nums2));
		int[] df = { 8, 3, 1, 4, 2, 1 };
		System.out.println(ej1.tresYDespuesDosYUno(df));
		int[] nums4 = { 8, 3, 1, 4, 2, 8, 4,1};
		System.out.println(ej1.tresYDespuesDosYUno(nums4));
	}

	public boolean tresYDespuesDosYUno(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				for (int j = i; j < nums.length; j++) {
					if (nums[j] == 2 && nums[j + 1] == 1) {
						
						return true;
					}

				}
			}
		}

		return false;
	}

}
