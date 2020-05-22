package com.test.concept;

public class MyThreadDemo {
	public static void main(String[] args) {
		ThreadDemo t=new ThreadDemo();
	//	t.start();
		MyRunnable mr=new MyRunnable();
		Thread thread=new Thread(mr);
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("infa");
		System.out.println(Thread.currentThread().getName());
		
	}
}

class ThreadDemo extends Thread
{
	public void run(){
		for(int i=0;i<2;i++){
			System.out.println("Child THread");
		}
	}
	
}
class MyRunnable implements Runnable
{

	@Override
	public void run() {
		System.out.println("Runnable");
		
	}
	
}