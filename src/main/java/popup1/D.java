package popup1;

import java.util.Date;

public class D
{
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		String d = date.toString();
		System.out.println(d);
		String[] s = d.split(" ");
		for (String mem : s)
		{
			System.out.println(mem);
		}
	}

}
