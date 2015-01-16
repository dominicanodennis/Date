import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Zeit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d2 = new Date(50000000);
		Date d1 = new Date();
		Date d3 = new Date();
		d3.setTime(456788956);;
		
		long l = d2.getTime();

		boolean b = d2.before(d1);
		boolean b2 = d2.after(d1);

		System.out.println(b + " " + " " + b2);

		System.out.println(d1);

		System.out.println(d2);
		System.out.println(l);
		System.out.println(d3);
		System.out.println();
		
		Calendar zeit = Calendar.getInstance();
		zeit.getTime();
		zeit.set(2010, 11, 24, 14, 35, 55);
		zeit.add(Calendar.DAY_OF_MONTH, -6);
		zeit.add(Calendar.YEAR, -1);
		zeit.set(2014, 8, 3);
		
		
		
		System.out.println(zeit.getTime());
		
		Date d4 = new Date();
		
		
		SimpleDateFormat f1 = new SimpleDateFormat("EEEE, 'der 'd.MMMM YYYY");
		
		System.out.println(f1.format(d4));
		System.out.println();

	}

}
