package org.dragonli.service.general.interfaces.general;

import java.util.Map;

public interface AuthService {
    Map<String, Object> validateAndRefresh(Map<String, Object> authDto,Boolean refreshTime,Boolean autoGenerate);
    Map<String, Object> validateAndRefresh(AuthDto authDto,Boolean refreshTime,Boolean autoGenerate);

    Map<String, Object> validateAndRefresh(Map<String, Object> authDto,Boolean refreshTime,Boolean autoGenerate, String privateKey,Long timeout);
    Map<String, Object> validateAndRefresh(AuthDto authDto,Boolean refreshTime,Boolean autoGenerate, String privateKey,Long timeout);

    Map<String, Object> generate(String uniqueId,Long uid,String code) ;
    Map<String, Object> generate(String uniqueId,Long uid,String code, String privateKey) ;

    String signOrigin (String uniqueId,Long uid,String code,Long time);
    String signOrigin (String uniqueId,Long uid,String code,Long time,String privateKey);
    String generateUniqueId(Long uid);
}