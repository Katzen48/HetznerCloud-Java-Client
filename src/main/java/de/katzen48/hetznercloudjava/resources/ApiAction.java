package de.katzen48.hetznercloudjava.resources;

import java.sql.Timestamp;

public class ApiAction 
{
	private int id;
	private String command;
	private Status status;
	private int progress;
	private Timestamp started;
	private Timestamp finished;
	private Resource[] resources;
	private RequestError error;
	
	
	public int getId() 
	{
		return id;
	}

	public String getCommand() 
	{
		return command;
	}
	
	public Status getStatus()
	{
		return status;
	}

	public int getProgress()
	{
		return progress;
	}

	public Timestamp getStarted()
	{
		return started;
	}

	public Timestamp getFinished()
	{
		return finished;
	}

	public Resource[] getResources()
	{
		return resources;
	}

	public RequestError getError() 
	{
		return error;
	}


	public static enum Status
	{
		running, success, error;
	}
}
