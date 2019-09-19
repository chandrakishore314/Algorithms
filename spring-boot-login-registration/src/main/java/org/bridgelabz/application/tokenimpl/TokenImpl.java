
 package org.bridgelabz.application.tokenimpl;
  
 import org.springframework.stereotype.Service;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
  
  @Service
  public class TokenImpl {
  
  private static final String SECRET = "1234567890ABCDEFGHIJJKLMNOPQRSTUVWXYZ";


    public String jwtToken(int id) { 
	  String token=null;
	  token=JWT.create().withClaim("id", id).sign(Algorithm.HMAC512(SECRET));
	  return token;
	  }
  
  public int parseJWT(String jwt) {
  Integer userId=0;
  if(jwt!=null) {
	  userId= JWT.require(Algorithm.HMAC512(SECRET)).build().verify(jwt).getClaim("id").asInt();
  }
  
  return userId; }
  }
 