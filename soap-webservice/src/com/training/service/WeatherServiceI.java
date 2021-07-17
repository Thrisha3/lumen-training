package com.training.service;

import com.training.interfaces.WeatherService;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;


@WebService
public class WeatherServiceI implements WeatherService {


    @Override
    public String getWeather(String city) {
        // TODO Auto-generated method stub
        Map<String, String> defaValue = new HashMap<String, String>();
        defaValue.put("sunrise", "6.00am");
        defaValue.put("sunset", "6.20pm");
        defaValue.put("max-temp", "36C");
        defaValue.put("min-temp", "22C");

 

        if (city.equals("chennai")) {
            defaValue.put("sunrise", "5.30am");
            defaValue.put("sunset", "6.10pm");
            defaValue.put("max-temp", "37C");
            defaValue.put("min-temp", "23C");
        }
        return defaValue.toString();
    }

}
 




