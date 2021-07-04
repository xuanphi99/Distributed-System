
public class GanChuKi {

	public static void t1() {
		int x=0;
		int y=0;
		int z=0;
		x=1;
		String reS = "";
		String tt1 = "",tt2="",tt3="";
		
		reS = ""+y+z;
		tt1= ""+y+z;
		y=1;
		
		reS = reS + x+z;
		tt2 = tt2 +x+z;
		z=1;
		
		reS = reS+ x+y;
		tt3 = tt3 + x+y;
		System.out.println("ket qua " + reS);
		System.out.println("chu ki  "+tt1+tt2+tt3);
	}
	public static void t2() {
		int x=0;
		int y=0;
		int z=0;
		x=1;
		y=1;
		String reS = "";
		String tt1 = "",tt2="",tt3="";
		
		reS = ""+reS+x+z;
		tt2 = ""+x+z;
		reS = ""+reS+y+z;
		tt1 = ""+y+z;
		
		z=1;
		
		reS = reS+ x+y;
		tt3 = ""+x+y;
		
		System.out.println("ket qua " + reS);
		System.out.println("chu ki  "+tt1+tt2+tt3);
	}
	
	
	public static void t3() {
		int x=0;
		int y=0;
		int z=0;
		
		y=1;
		z=1;
		String reS = "";
		String tt1 = "",tt2="",tt3="";
		
		reS = ""+reS+x+y;
		tt3 = ""+x+y;
		reS = ""+reS+x+z;
		tt2 = ""+x+z;
		x=1;
		reS = reS+ y+z;
		tt1= ""+y+z;
	
		
		System.out.println("ket qua " + reS);
		System.out.println("chu ki  "+tt1+tt2+tt3);
	}
	
	public static void t4() {
		int x=0;
		int y=0;
		int z=0;
		x=1;
		y=1;
		z=1;
		String reS = "";
	
		
		String tt1 = "",tt2="",tt3="";
		
		reS = ""+reS+x+z;
		tt2 = ""+x+z;
		
		reS = ""+reS+y+z;
		tt1 = ""+y+z;
		
		reS = reS+ x+y;
		tt3 = ""+x+y;
		
		System.out.println("ket qua " + reS);
		System.out.println("chu ki  "+tt1+tt2+tt3);
	}
	
	public static void main(String[] args) {
		System.out.println("==========t1========");
	t1();
	System.out.println("---------------t2------------");
	t2();
		System.out.println("----------t3-----------------");
		t3();
		System.out.println("---------t4----------");		
		t4();		
		
	}
	
}
