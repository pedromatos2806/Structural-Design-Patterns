package models;


public interface Protocolo {
	public void open();
	
	public void message(Request request, Response response);
	
	public void close();
}
