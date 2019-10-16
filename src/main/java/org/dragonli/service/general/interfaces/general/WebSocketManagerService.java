/**
 * 
 */
package org.dragonli.service.general.interfaces.general;

import java.util.Map;

/**
 * @author dev
 *
 */
public interface WebSocketManagerService extends ServiceVersionAble {
	public boolean sendTextMessage(String uniqueId, String content);
	public String recommendServer(String group);
	public Map<String,Object>recommendServerForUUid(String group,String uuid) throws Exception;
	public boolean sendTextMessage(String uniqueId,String content,String publicNetworkHost);
	public boolean sendTextMessage(String uniqueId,String content,String group,String id);	
	public int sendTextMessageToAll(String content);
	public Map<String,Object> doSendTextMessageToAll(String group,String content);
}
