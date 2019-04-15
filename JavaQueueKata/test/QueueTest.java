import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {
    private Queue testQueue;

    @Before
    public void setup () {
        testQueue = new Queue(10);
    }

    @Test
    public void addToQueue () {
        testQueue.enqueue(1);

        Assert.assertEquals(1, testQueue.currentCapacity());
    }

    @Test
    public void addMultipleToQueue () {
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        testQueue.enqueue(4);

        Assert.assertEquals(4, testQueue.currentCapacity());
    }

    @Test
    public void getCapacity () {
        testQueue.enqueue(1);
        testQueue.enqueue(2);

        Assert.assertEquals(2, testQueue.currentCapacity());
    }

    @Test
    public void getSize () {
        testQueue.enqueue(1);
        testQueue.enqueue(2);

        Assert.assertEquals(10, testQueue.size());
    }

    @Test
    public void removeFromQueue () {
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.dequeue();

        Assert.assertEquals(1, testQueue.currentCapacity());
    }

    @Test
    public void peekFrontOfQueue () {
        testQueue.enqueue(8);
        testQueue.enqueue(1);

        Assert.assertEquals(8, testQueue.peek());
    }

    @Test
    public void queueAndDequeueWithPeek () {
        testQueue.enqueue(99);
        testQueue.enqueue(5);
        testQueue.enqueue(6);
        testQueue.enqueue(3);
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();

        testQueue.enqueue(14);
        testQueue.enqueue(13);
        testQueue.enqueue(12);
        testQueue.dequeue();
        testQueue.dequeue();

        Assert.assertEquals(12, testQueue.peek());
        Assert.assertEquals(1, testQueue.currentCapacity());
    }

    @Test
    public void clearQueue () {
        testQueue.enqueue(99);
        testQueue.enqueue(5);
        testQueue.enqueue(6);
        testQueue.enqueue(3);
        testQueue.clear();

        Assert.assertEquals(0, testQueue.currentCapacity());
    }

    @Test
    public void addMultipleOfDifferentTypeToQueue () {
        testQueue.enqueue('4');
        testQueue.enqueue(5);
        testQueue.enqueue("6");
        testQueue.enqueue(99);

        Assert.assertEquals(4, testQueue.currentCapacity());
        Assert.assertEquals('4', testQueue.peek());
    }
}
