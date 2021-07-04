import java.text.SimpleDateFormat;

public class NTP {
	public static double toDate(int data[] , int index) {
		double time = 60*60*24*25567L;

		double timestamp = 0.0;
		for (int i = 0; i < 8; i++) {
			timestamp += Math.pow(2, (3-i)*8)*data[index+i];
		}
		return (timestamp-time)*1000.0;
	}
	
	public static void main(String[] args) {
		int[] data = {
				28,3,0,233,0,0,0,114,
				0,0,12,160,25,66,230,4,
				225,72,40,195,105,242,38,249,
				0,0,0,0,0,0,0,0,
				225,72,40,208,41,242,12,33,
				225,72,40,208,41,242,52,101
				};
		System.out.println("do dai mang "+ data.length);
		double t1 = toDate(data, 16);
		
		double t2 = toDate(data, 32);
		double t3 = toDate(data, 40);
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(t1));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(t2));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(t3));

		
		
	}
	
	

}
