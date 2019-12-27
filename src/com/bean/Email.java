package com.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Email {

	
	private String emailAddres;
	private String[] gijutsu={
			"C#",
			"java",
			"javascript"
	};

	public Email() {

	}

	public String getDateTime() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日　 HH時mm分ss秒");
		return "今時間:" + format.format(date);
	}
	
	public String getStr(){
		return "技術のリストアップ："+String.join(",", gijutsu);
	}

	public Email(String mailAddress) {
		this.emailAddres = mailAddress;
	}

	public String getEmailAddres() {
		return emailAddres;
	}

	public void setEmailAddres(String emailAddres) {
		this.emailAddres = emailAddres;
	}
}
