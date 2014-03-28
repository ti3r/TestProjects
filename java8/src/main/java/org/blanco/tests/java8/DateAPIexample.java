/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.blanco.tests.java8;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.chrono.HijrahDate;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.chrono.ThaiBuddhistDate;

/**
 *
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
public class DateAPIexample {
    
    
    public static void main(String[] args){
	LocalDate date = LocalDate.now();
	
	System.out.println(date);
	
	LocalTime time = LocalTime.now();
	System.out.println(time);
	//Time using a specific time zone
	time = LocalTime.now(Clock.fixed(Instant.now(), ZoneId.of("America/Chihuahua")));
	System.out.println("Time in Chihuahua: "+time);
	
	
	JapaneseDate jDate = JapaneseDate.now();
	System.out.println("The date in japanesse calendar is: "+jDate);
	
	HijrahDate hDate = HijrahDate.now();
	System.out.println("The date in Hirajah calendar is: "+hDate);
	
	MinguoDate mDate = MinguoDate.now();
	System.out.println("The date in Minguo calendar is: "+mDate);
	
	ThaiBuddhistDate tDate = ThaiBuddhistDate.now();
	System.out.println("The date in ThaiBuddhist calendar is: "+tDate);
	
	//Examples of converting dates to different calendars
	LocalDate tomorrowLand2014Date = LocalDate.of(2014, Month.JULY, 28);
	System.out.println("The date for tomorrowland 2014 in ISO calendar is: "+tomorrowLand2014Date);
	JapaneseDate jt2014Date = JapaneseChronology.INSTANCE
		.date(tomorrowLand2014Date.getYear(), tomorrowLand2014Date.getMonthValue(), tomorrowLand2014Date.getDayOfMonth());
	System.out.println("The date for tomorrowland 2014 in Japanesse calendar is: "+jt2014Date);
	
    }
}
