/**
 * 
 */
package org.dragonli.service.general.interfaces.general;

import java.util.Map;

/**
 * @author dev
 *
 */
public interface WebSocketService extends ServiceVersionAble {
	boolean sendTextMessage(String uniqueId, String content);
	String recommendServer();
	Map<String,Object>recommendServerForUUid(String uuid) throws Exception;
	boolean sendTextMessageByUniqueId(String unid, Map data,String key);
	/**
	 * 更新用户订阅信息本地
	 */
	void updateTopicMap(String[] topics,String unid);
	/**
	 * 清空用户的订阅信息本地
	 */
	void clearTopicById(String unid);
	/**
	 * 给主题订阅者推送消息
	 */
	void sendTextMessageByTopic(String topic,Map data,String key);
	/**
	 * 订阅主题
	 */
	boolean subscribe(String[] topics,String unid);
	
	boolean unsubscribe(String topic,String unid);


}
