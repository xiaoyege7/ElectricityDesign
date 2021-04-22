package xyz.xiaoye.springbootdemo03.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import xyz.xiaoye.springbootdemo03.entity.user.OpenIdJson;

public class GetOpenid {
    private String appID = "wxad3aa70df3666963";
    private String appSecret = "1902c9498bc23955cc654dba4b74fd40";

    public String getopenid(String code) throws JsonProcessingException {
        String result = "";
        try{//请求微信服务器，用code换取openid。HttpUtil是工具类
            String url = "https://api.weixin.qq.com/sns/jscode2session?appid="
                    + this.appID + "&secret="
                    + this.appSecret + "&js_code="
                    + code
                    + "&grant_type=authorization_code";
            result = HttpUtil.doGet(url
                    , null);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        //使用ObjectMapper类实现对json对象的转化
        ObjectMapper mapper = new ObjectMapper();
        OpenIdJson openIdJson = mapper.readValue(result,OpenIdJson.class);

        return openIdJson.getOpenid();
    }

}
