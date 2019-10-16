package org.dragonli.service.general.interfaces.general;

public interface ZookeeperService {

	public boolean lock(String key,int code);
	
	public boolean lock(String key,int code,Integer timeout);
	
	public void releaseLock(String key,int code);
	
	public String mapRedisHost(String key);
	public void sendMessage(String mobile, String content);
}
