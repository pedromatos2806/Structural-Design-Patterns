package decorator;

import models.Request;

public abstract class RequestDecorator implements Request {

	private Request request;
	
	public RequestDecorator(Request request) {
		this.request = request;
	}
	
	@Override
	public void addHeader(String chave, String valor) {
		this.request.addHeader(chave, valor);
	}

	@Override
	public String readHeader(String chave) {
		
		return this.request.readHeader(chave);
	}

	@Override
	public byte[] getContent() {
		return this.request.getContent();
	}

	@Override
	public void setContent(byte[] content) {
		this.request.setContent(content);
	}

	@Override
	public String getMessage() {
		return this.request.getMessage();
	}

	@Override
	public void setMessage(String message) {
		this.request.setContent(message.getBytes());
	}

}
