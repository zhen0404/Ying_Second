package com.util;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.Md5Hash;

public class CryptographyUtil {

	public static String md5(String str,String salt){
		return new Md5Hash(str, salt).toString();
	}
	
	public static String password(String str){
		return Base64.encodeToString(str.getBytes());
	}
	
	public static String nipassword(String str){
		return Base64.decodeToString(str.getBytes());
	}
	
}
