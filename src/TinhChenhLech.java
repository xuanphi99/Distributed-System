import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;
public class TinhChenhLech{

	public static void main (String[]args) throws ParseException{
    
//		 DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");  
//		 LocalDateTime now = LocalDateTime.now();  
//		 System.out.println(dtf2.format(now));  
		
		SimpleDateFormat  dtf = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS",Locale.ENGLISH);  
		   

		   
		   String t1 = "2021-06-28 22:01:45.778";
		   String t2 = "2021-06-28 22:30:04.905";
		   String t3 = "2021-06-28 09:32:29.960";
		   String t4 = "2021-06-28 09:32:28.659";
		 
		   
		   
		 
		   
		   String[] arrThanhVien = {
				     "2021-06-30 01:02:13.500"	,
				   	 "2021-06-30 01:03:16.150"	,
				  	 "2021-06-30 01:00:13.480"	,
				   	 "2021-06-30 01:02:16.170"	,
				   	 "2021-06-30 01:01:13.460"	,
				   	 "2021-06-30 01:04:16.190"	,
				   	 "2021-06-30 01:02:13.440"	,
				     "2021-06-30 01:03:16.210"	,
				   	 "2021-06-30 01:00:13.420"	,
				   	 "2021-06-30 01:02:16.230"	,
				   	 "2021-06-30 01:01:13.400"};
		   
		   
		   long time =0;
		  for (String string : arrThanhVien) {
			time = time+ (long)dtf.parse(string).getTime();
		} 
		 long a = time/(13) + (long)dtf.parse(arrThanhVien[0]).getTime() ;
		  System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(a));    
    }
 
   }