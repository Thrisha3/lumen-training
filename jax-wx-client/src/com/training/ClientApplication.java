package com.training;
 

public class ClientApplication {

	public static void main(String[] args) {
		
		
		WeatherServiceIService service= new WeatherServiceIService();
		
		
		WeatherServiceI proxy =  service.getWeatherServiceIPort();
		System.out.println(proxy.getWeather("chennai"));

	}

}
