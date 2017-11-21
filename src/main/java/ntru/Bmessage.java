package ntru;

import java.io.UnsupportedEncodingException;

public interface Bmessage 
{
	String ConvertToBinary(String message) throws UnsupportedEncodingException;
	String ConvertFromBinary(String message) throws UnsupportedEncodingException;
}