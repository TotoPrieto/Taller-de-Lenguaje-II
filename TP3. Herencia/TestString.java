public class TestString {
	public Integer num = 5;
	public Integer numMax = 10;

	public static void main(String[] args) {
		System.out.println("Evaluacion del tiempo de ejecuci�n de concatenaciones...");
		
		long start = 0L;
		long end = 0L;
		String s1 = "Cual ";
		String s2 = "de ";
		String s3 = "todos ";
		String s4 = "ejecuta ";
		String s5 = "mas ";
		String s6 = "rapido? ";

		start = System.currentTimeMillis();
		concat1(s1, s2, s3, s4, s5, s6);
		end = System.currentTimeMillis();
		System.out.println("Concat de String:::::" + (end - start) + " ms");

		start = System.currentTimeMillis();
		concat2(s1, s2, s3, s4, s5, s6);
		end = System.currentTimeMillis();
		System.out.println("Concat de StringBuffer:::::" + (end - start) + " ms");

		start = System.currentTimeMillis();
		concat3(s1, s2, s3, s4, s5, s6);
		end = System.currentTimeMillis();
		System.out.println("Concat de StringBuilder:::::" + (end - start) + " ms");


	}

	public static String concat1(String s1, String s2, String s3, String s4,
			String s5, String s6) {
		String result = "";
		for (int i = 0; i < 5000; i++) {
			result=result.concat(s1);
			result=result.concat(s2);
			result=result.concat(s3);
			result=result.concat(s4);
			result=result.concat(s5);
			result=result.concat(s6);
		}
		return result;
	}

	public static String concat2(String s1, String s2, String s3, String s4,
			String s5, String s6) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < 5000; i++) {
			result=result.append(s1);
			result=result.append(s2);
			result=result.append(s3);
			result=result.append(s4);
			result=result.append(s5);
			result=result.append(s6);
		}
		return result.toString();
	}

	public static String concat3(String s1, String s2, String s3, String s4,
			String s5, String s6) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < 5000; i++) {
			result=result.append(s1);
			result=result.append(s2);
			result=result.append(s3);
			result=result.append(s4);
			result=result.append(s5);
			result=result.append(s6);
		}
		return result.toString();
	}

}