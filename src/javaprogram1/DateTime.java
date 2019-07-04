/**
 * 
 */
package javaprogram1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author BHANU
 *
 */
public class DateTime {

	
	public static void main(String[] args) {
		
		Date d= new Date();
		LocalDateTime t= LocalDateTime.now();
SimpleDateFormat f= new SimpleDateFormat("MMM/dd/yy");
		//System.out.println(t);
		String s=f.format(d);
		System.out.println(s);
		t=LocalDateTime.now(ZoneId.of("GMT"));	
		
		//System.out.println(t);

	}

}
