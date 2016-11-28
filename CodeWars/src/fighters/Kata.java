package fighters;

public class Kata {
	  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
	    // Your code goes here. Have fun!
		int round = 0;
		do{
			round++;
			System.out.println("START ROUND>>" + round);
			System.out.println("Fighter1: " + fighter1.name + " health: " + fighter1.health);
			System.out.println("Fighter2: " + fighter2.name + " health: " + fighter2.health);
			if(fighter1.name.equals(firstAttacker)){
				attack(fighter1,fighter2);
				if(!isAlive(fighter2)){
					System.out.println("the winner is:::::" + fighter1.name);
					return fighter1.name;
				}
				attack(fighter2,fighter1);
				if(!isAlive(fighter1)){
					System.out.println("the winner is:::::" + fighter2.name);
					return fighter2.name;
				}
			}else{
				attack(fighter2,fighter1);
				if(!isAlive(fighter1)){
					System.out.println("the winner is:::::" + fighter2.name);
					return fighter2.name;
				}
				attack(fighter1,fighter2);
				if(!isAlive(fighter2)){
					System.out.println("the winner is:::::" + fighter1.name);
					return fighter1.name;
				}
			}
			
		}while(isAlive(fighter1) && isAlive(fighter2));
		return null;
	  }
	  
	  
	  /**
	  * attacker Fighter attacks on target Fighter
	  *
	  */
	  public static void attack(Fighter attacker, Fighter target){
		System.out.println("Attacking:::" + target.health + " - " + attacker.damagePerAttack);
	    target.health -= attacker.damagePerAttack;
	  } 
	  
	  /**
	  * Is Fighter alive
	  *
	  */
	  public static boolean isAlive(Fighter fighter){
		System.out.println("Still alive? " + fighter.health);
	    if(fighter.health > 0){
	      return true;
	    }else{
	      return false;
	    }
	  }
	}
