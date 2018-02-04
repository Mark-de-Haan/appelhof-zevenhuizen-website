package org.mdehaan.exception;

public class ContentNotFoundException extends RuntimeException
{
	public ContentNotFoundException()
	{
		super();
	}

	public ContentNotFoundException(final String message, final Throwable cause)
	{
		super(message, cause);
	}

	public ContentNotFoundException(final String message)
	{
		super(message);
	}

	public ContentNotFoundException(final Throwable cause)
	{
		super(cause);
	}
}
