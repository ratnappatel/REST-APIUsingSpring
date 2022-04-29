package com.infy.infyinterns.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.infy.infyinterns.exception.InfyInternException;

public class LoggingAspect
{

    private static final Log LOGGER = LogFactory.getLog(LoggingAspect.class);

    public void logServiceException(InfyInternException exception)
    {
	// code
    }

}
