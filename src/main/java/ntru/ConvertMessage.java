package ntru;

import java.io.UnsupportedEncodingException;

public final class ConvertMessage implements Bmessage 
{
		
	@Override
	public String ConvertToBinary(String message) throws UnsupportedEncodingException 
	{
		String result = "";	
		byte[] infoBin = null;
        infoBin = message.getBytes("UTF-8");
        
        for (byte b : infoBin) 
        {
        	String bin = Integer.toBinaryString(b); 
        	while ( bin.length() < 8 )
        	  bin = "0" + bin;
        	result += bin;
        }
        
		return result;
	}

	@Override
	public String ConvertFromBinary(String bytes) throws UnsupportedEncodingException
	{
		int i = bytes.length()/8;
	    int pos = 0;
	    String result = "";
	    byte[] buffer = new byte[i];
	    
	    for(int j=0; j<i; j++)
	    {
	        String temp = bytes.substring(pos,pos+8);
	        buffer[j] = (byte) Integer.parseInt(temp, 2);
	        pos+=8;
	    }
	    result = new String(buffer, "ISO-8859-1");
	    
	    return result;
		
	}
}

