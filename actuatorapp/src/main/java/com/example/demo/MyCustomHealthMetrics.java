package com.example.demo;

import java.util.HashMap;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class MyCustomHealthMetrics implements HealthIndicator{

	@Override
	public Health health() {
		// TODO Auto-generated method stub
		return Health.down().status(Status.OUT_OF_SERVICE).build();
	
	}
}
