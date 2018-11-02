package org.parking.api.process;

import org.apache.commons.lang.RandomStringUtils;

public class Utils {

	public static String GenerateTicketID() {
		String correlationID = RandomStringUtils.random(25, true, true);
		
		return correlationID;
	}
}
