package com.mstf.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class test {
public static void main(String[] args) throws Exception {
	 String strURL = "https://item.taobao.com/item.htm?spm=a230r.7195193.1997079397.9.dXdLo3&id=528984142267&abbucket=7&qq-pf-to=pcqq.c2c";  
	    URL url = new URL(strURL);  
	    HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();  
	    InputStreamReader input = new InputStreamReader(httpConn  
	            .getInputStream(), "utf-8");  
	    BufferedReader bufReader = new BufferedReader(input);  
	    String line = "";  
	    StringBuilder contentBuf = new StringBuilder();  
	    while ((line = bufReader.readLine()) != null) {  
	        contentBuf.append(line);  
	    }  
	    String buf = contentBuf.toString(); 
	    String s="";
	    String b=new String(buf.getBytes("GBK"),"ISO-8859-1");
//	    System.out.println(b);
	    int beginIx = buf.indexOf(">");  
	    int endIx = buf.indexOf("<!-- cph -->");  
	    String result = buf.substring(beginIx+1, endIx);  
	    System.out.println("captureHtml()的结果：\n" + result); 

	    int beginIx1 = buf.indexOf(">");  
	    int endIx1 = buf.indexOf("<!-- cph -->");  

}
}
