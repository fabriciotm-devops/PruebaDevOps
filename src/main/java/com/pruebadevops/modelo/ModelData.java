/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebadevops.modelo;

import java.io.Serializable;

/**
 *
 * @author Fabricyber
 */
public class ModelData implements Serializable{
        
        private String message;
	private String to;
	private String from;
	private String timeToLifeSec;
	private String Url;
	private String ApiKey;
	private String header;
        
        private static final String KEY = "2f5ae96c-b558-4c7b-a590-a501ae1c3f6c";
        private static final String HEADER = "X-Parse-REST-API-Key";
        
	
	public String getHeader() {
		return HEADER;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getApiKey() {
		return KEY;
	}
	public void setApiKey(String apiKey) {
		ApiKey = apiKey;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTimeToLifeSec() {
		return timeToLifeSec;
	}
	public void setTimeToLifeSec(String timeToLifeSec) {
		this.timeToLifeSec = timeToLifeSec;
	}
	public void setUrl(String url) {
		Url = url;
	}
	public String getClassUrl() {
        return Url;
    }
}
