package org.exercises.encaptulations.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        EnhancedPlayer ban = new EnhancedPlayer("Barn");
        EnhancedPlayer ban = new EnhancedPlayer("Barn",-1,"Sword");
//        enhancedPlayer.name = "Barn";
//        enhancedPlayer.health =20;
//        enhancedPlayer.weapon ="Sword";
        System.out.println("Ban Remaining health is = "+ ban.healthRemaining());
//        int damage = 10;
//        enhancedPlayer.loseHealth(enhancedPlayer);
//        System.out.println("Remaining health = "+ enhancedPlayer.healthRemaining());
//        enhancedPlayer.health = 100;
//        enhancedPlayer.loseHealth(11);
//        System.out.println("Remaining health = "+ enhancedPlayer.healthRemaining());
    }
}
