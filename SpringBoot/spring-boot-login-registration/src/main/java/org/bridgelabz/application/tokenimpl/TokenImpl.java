package org.bridgelabz.application.tokenimpl;

import java.security.Key;
import java.util.Base64;
import java.util.Date;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
@Service
public class TokenImpl {
	public static final Key secret = MacProvider.generateKey(SignatureAlgorithm.HS256);
	public static final byte[] secretBytes = secret.getEncoded();
	public static final String base64SecretBytes = Base64.getEncoder().encodeToString(secretBytes);
	
	public String jwtToken(int id) {

		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);

		JwtBuilder builder = Jwts.builder().setSubject(String.valueOf(id)).setIssuedAt(now).signWith(SignatureAlgorithm.HS256,
				base64SecretBytes);

		return builder.compact();
	}
	public int parseJWT(String jwt) {

		// This line will throw an exception if it is not a signed JWS (as expected)
		Claims claims = Jwts.parser().setSigningKey(base64SecretBytes).parseClaimsJws(jwt).getBody();

		System.out.println("Subject: " + claims.getSubject());

		return Integer.parseInt(claims.getSubject());
	}
	
	
	
}
