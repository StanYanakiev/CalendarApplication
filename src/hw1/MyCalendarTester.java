package hw1;
/** 
 * @author Stanislav Yanakiev
 * 
 * MyFirstCalendar
 * 
 * All Rights Reserved to Author
 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyCalendarTester 
{
	public static void main(String [] args)
	{
		GregorianCalendar cal = new GregorianCalendar(); // capture today
		MyCalendar c = new MyCalendar(cal);
		
		c.calendarView(cal);
		c.options();
		Scanner sc = new Scanner(System.in);
		boolean tmp = true;
		String input = sc.nextLine().toLowerCase();
		while (tmp == true)
		{
				if (input.equals("l")) 
				{
					c.load();
					c.calendarView(cal);
					c.options();
					input = sc.nextLine().toLowerCase();
					
				} else if (input.equals("v")) 
				{
					c.viewBy();
					c.calendarView(cal);
					c.options();
					input = sc.nextLine().toLowerCase();
				}
				else if (input.equals("c"))
				{
					c.create();
					c.calendarView(cal);
					c.options();
					input = sc.nextLine().toLowerCase();
				} 
				else if (input.equals("g")) 
				{
					c.goTo();
					c.calendarView(cal);
					c.options();
					input = sc.nextLine().toLowerCase();
				} 
				else if (input.equals("e"))
				{
					c.eventList();
					c.calendarView(cal);
					c.options();
					input = sc.nextLine().toLowerCase();
				} 
				else if (input.equals("d")) 
				{
					c.delete();
					c.calendarView(cal);
					c.options();
					input = sc.nextLine().toLowerCase();
				} 
				else if (input.equals("q"))
				{
					c.quit();
					tmp = false;
				} 
				else {
					System.out.println("INVALID KEY");
					c.calendarView(cal);
					c.options();
					input = sc.nextLine().toLowerCase();
				}
			}
		}
	}

