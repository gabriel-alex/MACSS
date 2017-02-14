package com.macss.agent.cognitive;

import java.util.logging.Level;

import madkit.kernel.Agent;


public class Facilitator extends Agent{
	
	@Override
	protected void activate(){
		//Thanks to this log level, everything I do will be automatically logged
		setLogLevel(Level.FINEST);
		
		//createGroup(COMMUNITY, GROUP);
		//requestRole(COMMUNITY, GROUP, ROLE);
	}
	
	@Override
	protected void live(){
		
	}
	@Override
	protected void end(){
		
	}

}
