package com.roomfinder.loginservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="room-service", url="localhost:8080")

// After introducing ribbon
//@FeignClient(name="room-service")

// To move the request from api gateway
@FeignClient(name="roomfinder-zuul-api-gateway-server")
@RibbonClient(name="room-service")
public interface RoomServiceProxy {

	// without zuul
    //@GetMapping("/roomController")
	
	// with zuul
	@GetMapping("/room-service/roomController")
    public String roomController();

}
