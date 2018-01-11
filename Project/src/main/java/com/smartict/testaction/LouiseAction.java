package com.smartict.testaction;

import com.opensymphony.xwork2.ActionSupport;

public class LouiseAction extends ActionSupport{
	
	private LouiseModel myModel;

	public LouiseModel getMyModel() {
		return myModel;
	}

	public void setMyModel(LouiseModel myModel) {
		this.myModel = myModel;
	}

	public String getNameInfo(){
		LouiseModel lModel = new LouiseModel();
		return SUCCESS;
	}
	
	
	
	/**
	 * GETTER & SETTER
	 */

}
