package com.incture.lms.util;

import java.sql.Timestamp;
import java.util.TimeZone;

public class ServiceUtil {
	public static java.sql.Timestamp getTimestamp(){
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return timestamp;
	}
}
