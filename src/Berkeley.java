import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Berkeley {

    public static long  calcTime(String dieuphoi, String t2) throws ParseException{
        long time = 0;
        SimpleDateFormat  dtf = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");  
        time = dtf.parse(t2).getTime()-dtf.parse(dieuphoi).getTime();
        return  time;
       }
       
       	public static void main (String[]args) throws ParseException{

   		SimpleDateFormat  dtf = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS",Locale.ENGLISH);  
   		   
   		   String t1 = "2021-06-30 08:00:19.652";
                      System.out.println("chênh lệch điều phối : 0" );
                      double timeAVG =0.0; 
                      String[] arrThanhVien = {"2021-06-30 07:59:18.535","2021-06-30 08:01:20.989"};
               for (String i : arrThanhVien) {             
                   long minus = calcTime(t1, i);
                   timeAVG += minus;
                   System.out.println("chenh lech : "+ i +"  "+ minus);
                   
               }
               
                System.out.println("Dieu chinh chưa round  = "+ timeAVG/(arrThanhVien.length+1));
               long dpEdit = dtf.parse(t1).getTime()+ Math.round(timeAVG/(arrThanhVien.length+1));
               System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(dpEdit));
         
               for (String string : arrThanhVien) {
                   long tv = 0;
                  
                     tv = dtf.parse(string).getTime()+ Math.round(timeAVG/(arrThanhVien.length+1))+ calcTime(t1, string)*(-1);     
                   
                   System.out.println("Dieu chinh chưa round  "+ (Math.round((timeAVG/(arrThanhVien.length+1)))+ calcTime(t1, string)*(-1)));
               System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(tv));    
               }
   		
       }
	
	
}
