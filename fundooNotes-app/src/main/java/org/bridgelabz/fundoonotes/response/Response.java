package org.bridgelabz.fundoonotes.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Response {

	private String message;
	private int statusCode;

	public Response(String message, int statusCode) {
		this.statusCode = statusCode;
		this.message = message;
	}

}
