package org.dragonli.service.general.interfaces.general;

import java.util.Map;

public interface AuthService {
    AuthDto validateAndRefresh(Map<String, Object> authDto,Boolean refreshTime,Boolean autoGenerate);
    AuthDto validateAndRefresh(AuthDto authDto,Boolean refreshTime,Boolean autoGenerate);

    AuthDto validateAndRefresh(Map<String, Object> authDto,Boolean refreshTime,Boolean autoGenerate, String privateKey,Long timeout);
    AuthDto validateAndRefresh(AuthDto authDto,Boolean refreshTime,Boolean autoGenerate, String privateKey,Long timeout);

    AuthDto generate(String uniqueId,long uid,String code) ;
    AuthDto generate(String uniqueId,long uid,String code, String privateKey) ;

    String signOrigin (String uniqueId,Long uid,String code,Long time);
    String signOrigin (String uniqueId,Long uid,String code,Long time,String privateKey);
    String generateUniqueId(Long uid);
}