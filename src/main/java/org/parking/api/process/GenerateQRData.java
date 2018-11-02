package org.parking.api.process;

import java.util.HashMap;

import org.fx3.emv.qr.DefaultCrcCalculator;
import org.fx3.emv.qr.QRComposer;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class GenerateQRData implements Callable {
	public Object onCall(MuleEventContext eventContext) {
		HashMap payload = (HashMap) eventContext.getMessage().getPayload();

		QRComposer bc = new QRComposer();
		bc.setCrc(new DefaultCrcCalculator());

		bc.set("00", "01");
		bc.set("01", "12");
		bc.set("02", "1234567890123456");
		bc.set("03", "1234567890123456");

		bc.set("26", "00", "ID.CO.OPTIMA-S");
		bc.set("26", "01", "1110000112341112007"); // merchant PAN
		bc.set("26", "02", "1112007"); // MID
		bc.set("26", "03", "UMI");

		bc.set("51", "00", "ID.CO.OPTIMA-S");
		bc.set("51", "02", "1112007"); // MID
		bc.set("51", "03", "UMI");

		bc.set("52", "1110");
		bc.set("53", "360");

		bc.set("54", (String)payload.get("billingAmount")); // amount
		bc.set("55", "02"); // fee type -> 02 = fixed value fee
		bc.set("56", "0"); // fee amount
		bc.set("58", "ID"); //country code

		bc.set("59", "UPT PARKIR"); // merchant name
		bc.set("60", "DKI JAKARTA"); // merchant city
		bc.set("61", "13210"); // Postal code

		bc.set("62", "01", (String)payload.get("ticketID")); // InvoiceID
		bc.set("62", "02", (String)payload.get("driverMsisdn")); // user msisdn
		// bc.set("62", "07", "1"); // TID

		String qrdata = bc.doCompose();

		return qrdata;
	}
}
