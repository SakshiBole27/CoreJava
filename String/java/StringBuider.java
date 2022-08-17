package String.java;

public class StringBuider {

	public static void main(String[] args) {
//		System.gc();
//		StringBuilder stringBuilder = new StringBuilder("Ankita");
//		long startTime1 = Calendar.getInstance().getTimeInMillis();
//		for (long i = 0; i < 10000000; i++) {
//			stringBuilder.append(i);
//		}
//		long endTime1 = Calendar.getInstance().getTimeInMillis();
//		System.out.println("Time taken for 10000000 appends for StringBuilder:" + (endTime1 - startTime1) + " ms");
//
//		System.gc();
//		StringBuffer stringBuffer = new StringBuffer("Vikram");
//		long startTime2 = Calendar.getInstance().getTimeInMillis();
//		for (long i = 0; i < 10000000; i++) {
//			stringBuffer.append(i);
//		}
//		long endTime2 = Calendar.getInstance().getTimeInMillis();
//		System.out.println("Time taken for 10000000 appends for StringBuffer:" + (endTime2 - startTime2) + " ms");

		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < 10000; i++) {
			sb.append("Tpoint");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Java");
		for (int i = 0; i < 10000; i++) {
			sb2.append("Tpoint");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
		
	}

}
