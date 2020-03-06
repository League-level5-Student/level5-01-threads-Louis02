package _03_Threaded_Reverse_Greeting;

public class ThreadedGreeter implements Runnable {
	int threadNum;

	public ThreadedGreeter(int threadNm) {
		threadNum = threadNm;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Greetings this is thread number " + threadNum);
		if (threadNum < 50) {		
			ThreadedGreeter tg = new ThreadedGreeter(threadNum+1);
			Thread th = new Thread(tg);
			th.start();
			try {
				th.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
