package org.dragonli.service.general.interfaces.general;

public interface OtherService {

	public String sha1(String str) throws Exception;
	
	public String addition(String str1,String str2,int scale) throws Exception;
	
	public String subtraction(String str1,String str2,int scale) throws Exception;
	
	public String multiplication(String str1,String str2,int scale) throws Exception;
	
	public String division(String str1,String str2,int scale) throws Exception;
}
