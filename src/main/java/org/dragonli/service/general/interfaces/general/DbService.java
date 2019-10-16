package org.dragonli.service.general.interfaces.general;

import java.util.List;
import java.util.Map;

public interface DbService {
	public Map<String,Object> get(String dbName,String table,Object pk) throws Exception;	
	public Map<String,Object> get(String dbName,String table,Object pk,String ak) throws Exception;	
	
	public Map<String,Object> save(String dbName,String table,Map<String,Object> model) throws Exception;
	public Map<String,Object> save(String dbName,String table,Map<String,Object> model,String ak) throws Exception;
	
	public Map<String,Object>[] list(String dbName,String table,String where,List<Object> paraList,String ak) throws Exception;
	public Map<String,Object>[] list(String dbName,String table,String where,List<Object> paraList) throws Exception;
	public Map<String,Object>[] list(String dbName,String table,String where,Object[] paras) throws Exception;
	public Map<String,Object>[] list(String dbName,String table,String where,Object[] paras,String ak) throws Exception;
	
//	public Map<String,Object>[] batchGet(String dbName,List<Map<String,Object>> paraList) throws Exception;
//	public Map<String,Object>[] batchGet(String dbName,List<Map<String,Object>> paraList,String table) throws Exception;
//	public Map<String,Object>[] batchGet(String dbName,Map<String,Object>[] models) throws Exception;
//	public Map<String,Object>[] batchGet(String dbName,Map<String,Object>[] models,String table) throws Exception;
//	
//	public Map<String,Object>[] multiGet(String dbName,String table,List<Object> paraList,String ak) throws Exception;
	public Map<String,Object>[] multiGet(String dbName,String table,List<Object> paraList) throws Exception;
	public Map<String,Object>[] multiGet(String dbName,String table,Object[] pks,String ak) throws Exception;
//	public Map<String,Object>[] multiGet(String dbName,String table,Object[] pks) throws Exception;
//	
//	public Map<String,Object>[] batchGet(String dbName,String table,List<Object> pks) throws Exception;
//	public Map<String,Object>[] batchGet(String dbName,String table,Object[] pks) throws Exception;
//	public Map<String,Object> batchSave(String dbName,List<Map<String,Object>> paraList,String tempPkTag) throws Exception;
	public Map<String,Object> batchSave(String dbName,List<Map<String,Object>> paraList,String tempPkTag,String ak) throws Exception;
	public Map<String,Object> batchSave(String dbName,List<Map<String,Object>> paraList,String tempPkTag) throws Exception;
	public Map<String,Object> batchSave(String dbName,List<Map<String,Object>> paraList,String tempPkTag,String table,String ak) throws Exception;
	public Map<String,Object> batchSave(String dbName,Map<String,Object>[] models,String tempPkTag) throws Exception;
	public Map<String,Object> batchSave(String dbName,Map<String,Object>[] models,String tempPkTag,String table) throws Exception;
	public Map<String,Object> batchSave(String dbName,Map<String,Object>[] models,String tempPkTag,String table,String ak) throws Exception;
	
	
	public Integer delete(String dbName,String table,Object pk) throws Exception;
	public Integer multiDelete(String dbName,String table,List<Object> paras) throws Exception;
//	public Integer multiDelete(String dbName,String table,Object[] pks) throws Exception;
	public Integer queryDelete(String dbName,String table,String where,List<Object> paraList) throws Exception;
	public Integer queryDelete(String dbName,String table,String where,Object[] paras) throws Exception;
	public Integer count(String dbName,String table,String where,List<Object> paraList) throws Exception;
	public Integer count(String dbName,String table,String where,Object[] paras) throws Exception;
	
	public Map<String,Object> toOne(String dbName,Map<String,Object> one,Map<String,String> mapping,String ak) throws Exception;
	public Map<String,Object> toOne(String dbName,Map<String,Object> one,Map<String,String> mapping) throws Exception;
	public Map<String,Object>[] toOne(String dbName,Map<String,Object>[] models,Map<String,String> mapping, String ak) throws Exception;
	public Map<String,Object>[] toOne(String dbName,List<Object> models,Map<String,String> mapping) throws Exception;
	
//	public Map<String,Object> toMany(String dbName,Map<String,Object> one,Map<String,String> mapping,String ak) throws Exception;
	public Map<String,Object> toMany(String dbName,Map<String,Object> one,Map<String,String> mapping) throws Exception;
	public Map<String,Object>[] toMany(String dbName,Map<String,Object>[] models,Map<String,String> mapping) throws Exception;
	public Map<String,Object>[] toMany(String dbName,List<Object> models,Map<String,String> mapping) throws Exception;
//	public Map<String,Object>[] toMany(String dbName,Map<String,Object>[] models,Map<String,String> mapping,Map<String,List<Object>[]> values) throws Exception;
//	public Map<String,Object>[] toMany(String dbName,List<Object> models,Map<String,String> mapping,Object values) throws Exception;
	public Map<String,Object>[] toMany(String dbName,List<Object> models,Map<String,String> mapping,Map<String,Object> values) throws Exception;
//	public Map<String,Object>[] toMany(String dbName,Map<String,Object>[] models,Map<String,String> mapping,Map<Object,Object> values) throws Exception;
	
	public Map<String,Object>[] listIn(String dbName,String table,String field,Object[] values) throws Exception;
	public Map<String,Object>[] listIn(String dbName,String table,String field,List<Object> values) throws Exception;
	public Map<String,Object>[] listBy(String dbName,String table,String field,Object v) throws Exception;
	public Map<String,Object>[] listBy(String dbName,String table,String field,Object v,String order) throws Exception;
	public Map<String,Object>[] listBy(String dbName,String table,String field,Object v,String order,Integer perPage,Integer page) throws Exception;
	public Map<String,Object>[] listBy(String dbName,String table,String[] fields,Object[] v) throws Exception;
	public Map<String,Object>[] listBy(String dbName,String table,String[] fields,Object[] v,String order) throws Exception;
	
//	public Map<String,Object>[] exec(String dbName,String sql,Object[] paras,String ak) throws Exception;
	public Map<String,Object>[] exec(String dbName,String sql,Object[] paras) throws Exception;
	public Map<String,Object>[] exec(String dbName,String sql,List<Object> paras) throws Exception;
	
//	public Map<String,Object> getFromCache(String dbName,String table,Object pk) throws Exception;
//	public Map<String,Object> getFromCache(String dbName,String table,Object pk,Jedis jedis) throws Exception;
//	public Map<String,Object> getFromCache(
//			String dbName,String table,Object pk,Pipeline pipe,Map<String, Response<String>> response) throws Exception;
//
//	public void saveToCache(String dbName,String table,Object pk,Map<String,Object> model);
//	public void saveToCache(String dbName,String table,Object pk,Map<String,Object> model,Object jedisOrPipe);
//	public void deleteFromCache(String dbName,String table,Object pk);
	
	public Map<String,Object>[] batchUpdate(String dbName,String[] sqls) throws Exception;
	public Map<String,Object>[] batchUpdate(String dbName,String sql,List<Object[]> where) throws Exception;
	
//	public Object test();
}
