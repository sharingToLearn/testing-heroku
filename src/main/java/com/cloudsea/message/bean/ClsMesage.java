package com.cloudsea.message.bean;

public class ClsMesage {

	public ClsMesage(String message, MessageType messageType, EmailMessage emailMessage) {
		this.message = message;
		this.messageType = messageType;
		this.emailMessage = emailMessage;
	}

	public ClsMesage() {

	}

	private String message;

	private MessageType messageType;

	private EmailMessage emailMessage;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageType getMessageType() {
		return messageType;
	}

	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}

	public EmailMessage getEmailMessage() {
		return emailMessage;
	}

	public void setEmailMessage(EmailMessage emailMessage) {
		this.emailMessage = emailMessage;
	}

	@Override
	public String toString() {
		return "ClsMesage [message=" + message + ", messageType=" + messageType + ", emailMessage=" + emailMessage
				+ "]";
	}
	
	

}
