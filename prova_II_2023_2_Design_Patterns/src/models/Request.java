package models;


public interface Request {
	
	public void addHeader(String chave, String valor);
	
	public String readHeader(String chave);
	
	public byte[] getContent();
	
	public void setContent(byte[] content);
	
	public String getMessage();
	
	public void setMessage(String message);
}
