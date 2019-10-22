package org.dragonli.service.general.interfaces.general;

public interface OtherService {

	String sha1(String str) throws Exception;
	
	String addition(String str1,String str2,int scale) throws Exception;

	String sha1(String str,Integer len) throws Exception;

	String md5(String str) throws Exception;

	String md5(String str,Integer len) throws Exception;

	String byteArrayToHexStr(byte[] arr);

	String toShortCryptoCode(String sourceCode,Integer shortCodeLength);
	
	String subtraction(String str1,String str2,int scale) throws Exception;
	
	String multiplication(String str1,String str2,int scale) throws Exception;
	
	String division(String str1,String str2,int scale) throws Exception;
}
