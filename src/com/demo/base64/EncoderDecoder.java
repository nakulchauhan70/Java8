package com.demo.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class EncoderDecoder {

	public static void main(String[] args) throws UnsupportedEncodingException {
		encodeDecode();
		encodeDecodeMime();
		encodeDecodeUrl();
	}

	private static void encodeDecode() throws UnsupportedEncodingException {
		final String str = "Encode and decode me using normal encoder and decoder.";
		
		String encodedText = Base64.getEncoder().encodeToString(str.getBytes("UTF-8"));
		System.out.println(encodedText);
		
		byte[] decodedText = Base64.getDecoder().decode(encodedText);
		System.out.println(new String(decodedText, "UTF-8"));
	}
	
	private static void encodeDecodeMime() throws UnsupportedEncodingException {
		final String str = "Encode and decode me using mime encoder and decoder.";
		
		String encodedText = Base64.getMimeEncoder().encodeToString(str.getBytes("UTF-8"));
		System.out.println(encodedText);
		
		byte[] decodedText = Base64.getMimeDecoder().decode(encodedText);
		System.out.println(new String(decodedText, "UTF-8"));
	}
	
	private static void encodeDecodeUrl() throws UnsupportedEncodingException {
		final String str = "Encode and decode me using url encoder and decoder.";
		
		String encodedText = Base64.getUrlEncoder().encodeToString(str.getBytes("UTF-8"));
		System.out.println(encodedText);
		
		byte[] decodedText = Base64.getUrlDecoder().decode(encodedText);
		System.out.println(new String(decodedText, "UTF-8"));
	}

}
