
public class Battle {
	
	public static void doBattle(Pokemon p1, Pokemon p2) {
		if (p2.getSpeed() > p1.getSpeed()) {
			Pokemon placeHolder = p1;
			p1 = p2;
			p2 = placeHolder;
		}
		
		int turns = 0;
		
		while (p1.getHp() > 0 && p2.getHp() > 0) {
			p2.setHp(p2.getHp() - (calculateDamage(p1.getAtk(), p2.getDef())));
			p1.setHp(p1.getHp() - (calculateDamage(p2.getAtk(), p1.getDef())));
			turns++;
		}
		System.out.println("It took " + turns + " turns to finish the battle.");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
	
	private static int calculateDamage(int atk, int def) {
		if (atk - def < 1) {
			return 1;
		}
		return atk - def;
	}

}
