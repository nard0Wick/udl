package com.demo.backend;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Key;
import java.util.Arrays;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(BackendApplication.class, args);
		/*byte[] keyBytes = Decoders
                .BASE64
                .decode("404E635266556A586E3272357538782F413F4428472B4B6250645367566B5970");
		System.out.println("->" + Keys.hmacShaKeyFor(keyBytes));
		System.out.println();*/
	}

}
