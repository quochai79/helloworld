package com.javahelps.helloworld;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurentDayTime {
	public String GetCurent(String showTime){
		Date date = new Date();
		 
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        showTime = dateFormat.format(date.getTime());

        return showTime;
	}
}
