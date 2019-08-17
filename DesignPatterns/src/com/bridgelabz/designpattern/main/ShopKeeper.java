package com.bridgelabz.designpattern.main;

import com.bridgelabz.designpattern.interfaces.Infocus;
import com.bridgelabz.designpattern.interfaces.MobileShop;
import com.bridgelabz.designpattern.interfaces.Nokia;

public class ShopKeeper {
	
private MobileShop nokia;
private MobileShop infocus;
ShopKeeper(){
	nokia=new Nokia();
	infocus=new Infocus();
}
public void nokiaSale() {
	nokia.modelNum();
	nokia.price();
}

public void infocusSale() {
	infocus.modelNum();
	infocus.price();
}


}
