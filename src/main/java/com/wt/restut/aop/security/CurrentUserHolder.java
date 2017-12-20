package com.wt.restut.aop.security;

public class CurrentUserHolder {
	private static final ThreadLocal<String> holder = new ThreadLocal<>();
	public static String get() {
		return CurrentUserHolder.get() == null?"unknown":holder.get();
	}
	public static void set(String user) {
		holder.set(user);
	}
}
