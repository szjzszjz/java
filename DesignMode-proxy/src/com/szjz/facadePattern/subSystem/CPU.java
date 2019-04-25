package com.szjz.facadePattern.subSystem;

public class CPU {

	public void startup() {
		System.out.println(this.getClass().getSimpleName() + " startup!");
	}

	public void shutdown() {
		System.out.println(this.getClass().getSimpleName() + " shutdown!");
	}
}
