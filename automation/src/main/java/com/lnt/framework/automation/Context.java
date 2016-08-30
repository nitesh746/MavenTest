package com.lnt.framework.automation;

public class Context {
	public static Global getLocal() {
		return new Global();
	}
	public static Local getGlobal() {
		return new Local();
	}
}