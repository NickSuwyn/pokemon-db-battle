
public class Pokemon {
	
	private String name;
	private String nickname;
	private String type1;
	private String type2;
	private int level;
	private int hp;
	private int atk;
	private int def;
	private int spcAtk;
	private int spcDef;
	private int speed;
	
	public Pokemon(String name, String nickname, String type1, String type2,
			int level, int baseHp, int modHp, int baseAtk, int modAtk, 
			int baseDef, int modDef, int baseSpcAtk, int modSpcAtk,
			int baseSpcDef, int modSpcDef, int baseSpeed, int modSpeed) {
		this.setName(name);
		this.setNickname(nickname);
		this.setType1(type1);
		this.setType2(type2);
		this.setLevel(level);
		this.setHp(baseHp + modHp);
		this.setAtk(baseAtk + modAtk);
		this.setDef(baseDef + modDef);
		this.setSpcAtk(baseSpcAtk + modSpcAtk);
		this.setSpcDef(baseSpcDef + modSpcDef);
		this.setSpeed(baseSpeed + modSpeed);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getSpcAtk() {
		return spcAtk;
	}

	public void setSpcAtk(int spcAtk) {
		this.spcAtk = spcAtk;
	}

	public int getSpcDef() {
		return spcDef;
	}

	public void setSpcDef(int spcDef) {
		this.spcDef = spcDef;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", nickname=" + nickname + ", type1=" + type1 + ", type2=" + type2 + ", level="
				+ level + ", hp=" + hp + ", atk=" + atk + ", def=" + def + ", spcAtk=" + spcAtk + ", spcDef=" + spcDef
				+ ", speed=" + speed + "]";
	}

}
