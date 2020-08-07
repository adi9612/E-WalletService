package com.aditya.walletservice.Util;

import java.net.URISyntaxException;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SmsUtil {
    private static final Logger logger = LoggerFactory.getLogger(SmsUtil.class);
    void sendSms()throws URISyntaxException, UnirestException
    {
        HttpResponse response = Unirest.get("")
                .header("cache-control", "no-cache")
                .asString();
        logger.info(response.getBody().toString());
        logger.info(response.getHeaders().toString());
    }
}
