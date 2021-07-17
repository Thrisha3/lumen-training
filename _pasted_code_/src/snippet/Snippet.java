package snippet;

public class Snippet {
	spring:
	  application:
	    name: payment-service-client
	
	
	
	eureka:
	  client:
	    register-with-eureka: true
	    fetch-registry: true
	    service-url:
	      defaulttZone: http://localhost:8761/eureka
	  instance:
	    prefer-ip-address: true
	
}

