package com.bridgelabz.designpattern.adapterdesignpattern.interfaces;

import com.bridgelabz.designpattern.adapterdesignpattern.main.Socket;
import com.bridgelabz.designpattern.adapterdesignpattern.main.Volt;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
Socket socket =new Socket();
	@Override
	public Volt get120Volt() {
		
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v= socket.getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		Volt v= socket.getVolt();
		return convertVolt(v,40);
	}
	Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
