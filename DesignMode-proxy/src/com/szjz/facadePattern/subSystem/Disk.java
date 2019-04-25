package com.szjz.facadePattern.subSystem;

public class Disk {

	public void startup() {
		System.out.println(this.getClass().getSimpleName() + " startup!");
	}

	public void shutdown() {
		System.out.println(this.getClass().getSimpleName() + " shutdown!");
	}
}
