import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Cristiannas {

    
    public static long  calcTime(String dieuphoi, String t2) throws ParseException{
     long time = 0;
     SimpleDateFormat  dtf = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");  
     time = dtf.parse(t2).getTime()-dtf.parse(dieuphoi).getTime();
     return  time;
    }
    
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat  dtf = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS",Locale.ENGLISH);  
        String chu1 = "2021-06-30 08:02:15.378";
        String khach1 = "2021-06-30 08:01:32.858";
        String chu2 = "2021-06-30 08:02:15.956";
        String khach2 = "2021-06-30 08:01:37.426";
  // CHỦ - KHÁCH      
        double time = (  calcTime(khach1, chu1) + calcTime(khach2, chu2)  )/2;
        System.out.println("time = "+ time);
        
          long dpEdit = dtf.parse(khach2).getTime()+ Math.round(time);
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(dpEdit));
        
            System.out.println("tick "+ time* 10000);
            
    }
	
	
}
