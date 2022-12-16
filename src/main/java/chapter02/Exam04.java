package chapter02;


public class Exam04 {
}

class Room implements AutoCloseable {


    private static class State implements Runnable {

        int numJunkPiles;

        public State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        @Override
        public void run() {
            System.out.println("방 청소");
            numJunkPiles = 0;
        }
    }

    private final State state;


    public Room(int numJunkPiles) {
        state = new State(numJunkPiles);

    }

    @Override
    public void close() throws Exception {

    }
}
