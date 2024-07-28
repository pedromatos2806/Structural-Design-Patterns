package adapter;

import decorator.RequestDecorator;
import models.AES256;
import models.Request;

public class AdapterAES extends RequestDecorator implements Request {
	
	private AES256 aes;
	
	public AdapterAES(AES256 aes, Request request) {
		super(request);
		this.aes= aes;
	}
	
	@Override
	public String getMessage() {
		this.aes.init();
		return new String (this.aes.doFinal(super.getMessage().getBytes()));
	}
}
