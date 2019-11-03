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
	boolean sendTextMessage(String uniqueId, String content);
	String recommendServer(String group);
	Map<String,Object>recommendServerForUUid(String group,String uuid) throws Exception;
	boolean sendTextMessage(String uniqueId,String content,String publicNetworkHost);
	boolean sendTextMessage(String uniqueId,String content,String group,String id);	
	int sendTextMessageToAll(String content);
	Map<String,Object> doSendTextMessageToAll(String group,String content);
}
