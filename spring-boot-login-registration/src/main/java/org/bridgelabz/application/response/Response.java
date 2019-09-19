package org.bridgelabz.application.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Response {
	private String str;
	private int num;
	public Response(String str,int num){
		this.num=num;
		this.str=str;
		}
	
}
