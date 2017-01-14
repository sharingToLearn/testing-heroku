package com.cloudsea.message.bean;

public class EmailMessage {

	private String sender;

	private String recepient;
	
	private String senderPassword;

	public EmailMessage() {
	}

	public String getSender() {
		return sender;
	}

	public String getRecepient() {
		return recepient;
	}

	public String getSenderPassword() {
		return senderPassword;
	}

	@Override
	public String toString() {
		return "EmailMessage [sender=" + sender + ", recepient=" + recepient + ", senderPassword=" + senderPassword
				+ "]";
	}
	
	

}
