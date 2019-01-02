package demo_project;

import java.util.*;

public class demo_file {

	public String hash;
	public String previousHash;
	private String data;
	private long timeStamp;

	public demo_file(String data, String previousHash)
	{
		this.data = data;
		this.previousHash = previousHash;
		this.timeStamp = new Date().getTime();
		this.hash = calculateHash();
	}

	public String calculateHash()
	{
		String calculatehash = StringUtil.applySha256(previousHash + Long.toString(timeStamp) +  data);
		return calculatehash;
	}
	public String hello()
	{
		return "hello";
	}
}
