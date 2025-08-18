package executorframework;


class Task1 extends Thread{
	public void run() {
		
		System.out.println("Task1 Started");
		for(int i=1;i<=5;i++) {
			try {
				System.out.println("Hello");
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Task1 Done");	
	}
}

class Task2 extends Thread{
	public void run() {
		System.out.println("Task2 Started");
		for(int i=1;i<=5;i++) {
			try {
				System.out.println("Hii");
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Task2 Done");	
	}
}

class Task3 extends Thread{
	public void run() {
		System.out.println("Task3 Started");
		for(int i=1;i<=5;i++) {
			try {
				System.out.println("Hiiiii");
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Task3 Done");	
	}
}


class Task4 extends Thread{
	public void run() {
		System.out.println("Task4 Started");
		for(int i=1;i<=5;i++) {
			try {
				System.out.println("HAHAHA");
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Task4 Done");	
	}
}

class Task5 extends Thread{
	public void run() {
		System.out.println("Task5 Started");
		for(int i=1;i<=5;i++) {
			try {
				System.out.println("Hmmmmmm");
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Task5 Done");	
	}
}

