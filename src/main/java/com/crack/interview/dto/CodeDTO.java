package com.crack.interview.dto;

import java.io.Serializable;

public class CodeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8753509413486442735L;
	private String code;

	private String output;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

}
