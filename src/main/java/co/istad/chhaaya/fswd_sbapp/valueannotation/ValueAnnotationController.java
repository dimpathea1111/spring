package co.istad.chhaaya.fswd_sbapp.valueannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


record AppInfo (String appName,
                Integer appPort){

}

public class ValueAnnotationController {

    @Value("${spring.application.name}")
    private  String appName;

    @Value("${server.port}")
    private  Integer appPort;

    @GetMapping("/info")
    public  AppInfo getAppInfo(){
        return  new AppInfo(appName,appPort);
    }

}
