package models;


import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class GenericRequest implements Request{

	public Map<String,String> header;
	
	public byte[] content;
	
	public GenericRequest() {
		this.header = new HashMap<String, String>();
	}
	
	@Override
	public void addHeader(String chave, String valor) {
		this.header.put(chave, valor);
	}

	@Override
	public String readHeader(String chave) {
		return this.header.get(chave);
	}

	@Override
	public byte[] getContent() {
		
		return this.content;
	}

	@Override
	public void setContent(byte[] content) {
		this.content = content;
		
	}

	@Override
	public String getMessage() {
		return new String(getContent(), StandardCharsets.UTF_8);
	}

	@Override
	public void setMessage(String content) {
		this.content = content.getBytes();
	}

}
