class Buffer {
    private int data;
    private boolean hasData = false;

    // Produce method
    public synchronized void produce(int value) {
        try {
            while (hasData) {
                wait(); // wait if buffer is full
            }
            data = value;
            System.out.println("Produced: " + data);
            hasData = true;
            notify(); // notify consumer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Consume method
    public synchronized int consume() {
        try {
            while (!hasData) {
                wait(); // wait if buffer is empty
            }
            System.out.println("Consumed: " + data);
            hasData = false;
            notify(); // notify producer
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return data;
    }
}

// Producer thread
class Producer extends Thread {
    Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer thread
class Consumer extends Thread {
    Buffer buffer;
    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class
public class Program2 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
