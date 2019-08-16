package com.bridgelabz.designpattern.mediatordesignpattern;

import java.util.Date;

public class ChatRoom {
	static String date=new Date().toString();
static void sendMessage(String user,String msg) {
	System.out.println(date+" "+user+" "+msg);
}
	
}
