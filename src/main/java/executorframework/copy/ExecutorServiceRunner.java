package executorframework.copy;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorServiceRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		//ExecutorService executorService=Executors.newSingleThreadExecutor();  //only one single thread will execute
		
		ExecutorService executorService=Executors.newFixedThreadPool(2);  //2 Threads will active 
		
//		ExecutorService executorService=Executors.newCachedThreadPool();  // it creates a size to execute the tasks simultaneously
		executorService.execute(new Task1());
		executorService.execute(new Task2());
		executorService.execute(new Task3());
		executorService.execute(new Task4());
		executorService.execute(new Task5());
		
		
		
		executorService.shutdown();
		
		

	}

}
