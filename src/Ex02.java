import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex02 {

	public static void main(String[] args) {
        long sss = 60*60*24*25567L;
        short[] arr = {225,72,39,243,102,110,35,202,
        		225,72,39,245,94,126,108,237,
        		225,72,39,245,94,126,147,131};
        for(int pos=0; pos<3;pos++ ){
            double time=0.0;
            int ind=pos*8;
            for(int i =ind;i<ind+8;i++){
                time=time+arr[i]*Math.pow(2, (ind+3-i)*8);
                
            }
            String res=new SimpleDateFormat("YYYY-MM-dd hh:mm:ss.SSS").format(new Date((long)(1000*(time-sss))));
            System.out.println(res);
        }
        System.out.println(arr.length);
    

	}

}
