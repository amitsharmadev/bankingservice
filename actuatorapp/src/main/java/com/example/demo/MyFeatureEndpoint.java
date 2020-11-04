package com.example.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "myfeatures")
public class MyFeatureEndpoint {
	
	private Map<String,Feature> features=new ConcurrentHashMap<String, Feature>();
	@PostConstruct
	public void fillFeature() {
		Feature tmp=new Feature();
		tmp.setEnabled(false);
		features.put("feature1",tmp );
		tmp.setEnabled(true);
		features.put("feature2",tmp );
		features.put("feature3",tmp );
			
	}
	
	
	@ReadOperation
	public Feature feature(@Selector String name) {
		return features.get(name);
	}

	
	@DeleteOperation
	public void deleteFeature(@Selector String name) {
		features.remove(name);
	}
	
	
	@WriteOperation
	public void configureFeature(@Selector String name,Feature feature) {
		features.put(name,feature);
	}
	
	public static class Feature{
		private Boolean enabled;

		public Boolean getEnabled() {
			return enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
		
	}
	
}
