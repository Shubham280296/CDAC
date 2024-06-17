package day9;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;

public class DemoReaderWriter {

	public static void main(String[] args) {

		BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
		Executor service = Executors.newFixedThreadPool(4);
		

		for(int i=0;i<5;i++)
		{
			service.execute(new QueueReader(queue));
			service.execute(new QueueWriter(queue));
		}
	}

}
