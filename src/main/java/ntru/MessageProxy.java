package ntru;

import java.io.UnsupportedEncodingException;

public class MessageProxy implements Bmessage
{
	private String message;

	private ConvertMessage m;
	
	public MessageProxy ()
	{
		m = new ConvertMessage();
	}
	
	@Override
	public String ConvertToBinary(String message) throws UnsupportedEncodingException 
	{
		String proxy =  m.ConvertToBinary(message);
		System.out.println("converted to binary: ");
		
		return proxy;
	}

	@Override
	public String ConvertFromBinary(String bytes) throws UnsupportedEncodingException
	{
		String proxy = m.ConvertFromBinary(bytes);
		System.out.println("converted to String: ");
		
		return proxy;
	}
	
}
