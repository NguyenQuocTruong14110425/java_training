package demo_project;

import java.util.*;

public class Block {

	public String hash;
	public String previousHash;
	private String data;
	private long timeStamp;

	public Block(String data, String previousHash)
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
}
