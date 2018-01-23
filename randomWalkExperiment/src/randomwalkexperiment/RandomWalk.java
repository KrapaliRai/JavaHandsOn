/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomwalkexperiment;

/**
 *
 * @author krapa
 */
import java.util.Random;

public class RandomWalk {
    // the man is initially is at zero that is origin.
    private int x = 0;
    private int y = 0;

    private final Random random = new Random();

    public void move(int dx, int dy) {
      // Here we added the distance
       x += dx;
       y += dy;
        // TODO you need to implement this
    }

    private void randomWalk(int n) {
        for (int i = 0; i < n; i++)
            randomMove();
    }

    private void randomMove() {
        // TODO you need to implement this
    }

    public double distance() {
        return 0;
        // TODO you need to implement this
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        RandomWalk walk = new RandomWalk();
        walk.randomWalk(n);
        System.out.println(n + " steps: " + walk.distance());
    }
}

