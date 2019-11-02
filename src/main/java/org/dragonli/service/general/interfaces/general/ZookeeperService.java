package org.dragonli.service.general.interfaces.general;

public interface ZookeeperService {

	boolean lock(String key,int code);
	
	boolean lock(String key,int code,Integer timeout);
	
	void releaseLock(String key,int code);
	
	String mapRedisHost(String key);
	void sendMessage(String mobile, String content);
}
