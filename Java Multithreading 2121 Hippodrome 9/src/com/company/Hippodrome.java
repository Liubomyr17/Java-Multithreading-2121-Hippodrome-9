package com.company;

/*

2113 Hippodrome 9

Now back to the move and print methods. Let's start with move.
In the move method of the Hippodrome class in a loop for each horse, we call the move method.
Yes, you're right, the Horse class does not yet have it.
Therefore, you need to add your move method to the Horse class :)
And the print method, by the way, too.
If I do not say anything about the parameters of the method, then the method without parameters.
Do all public methods unless explicitly stated otherwise.

Requirements:
1. In the Horse class, the move method must be created.
2. In the Horse class, the print method must be created.
3. In the move method of the Hippodrome class, the move method must be called once for each horse
(each element of the horses list).


 */

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;

    public List<Horse> getHorses() {
        return this.horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) {
        Horse horse1 = new Horse("me", 3, 0);
        Horse horse2 = new Horse("myself", 3, 0);
        Horse horse3 = new Horse("i", 3, 0);
        List<Horse> horses = new ArrayList<Horse>();
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        }

        public void move() {
        horses.forEach(Horse::move);
        }

        public void print() {
        }

        public void run() {
        for (int i=0; i<100; i++) {
            this.move();
            this.print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
}

