package org.exercises.NoEncapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Barn";
        player.health =20;
        player.weapon ="Sword";
//        System.out.println(player);
        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+player.healthRemaining());
        player.health = 100;
        player.loseHealth(11);
        System.out.println("Remaining health = "+player.healthRemaining());
    }
}
