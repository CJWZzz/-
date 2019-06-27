package one;

public class Hero {
	String name;//name
	float hp;
	float armor;
	int moveSpeed;
	
	//获取护甲值
	float getArmor() {
		return armor;
	}
	
	//坑队友
	void keng() {
		System.out.println("坑队友！");
	}
	
	//超神
	void legendary() {
		System.out.println("超神");
	}
	
	//获取当前血量
	float getHp() {
		return hp;
	}
	
	//回血
	float recovery(float blood) {
		if (445 < blood) {
			for(int i = 0; i < 445; i ++) {
				blood = blood + 1.5f;
			}
		}
		return blood;
	}
	
	void addSpeed(int speed) {
		//在原来基础上增加移动速度
		moveSpeed = moveSpeed + speed;
	}
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "garen";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		garen.addSpeed(100);
		
		Hero teem = new Hero();
		teem.name = "teem";
		teem.hp = 383.28f;
		teem.armor = 14.536f;
		teem.moveSpeed = 350;
	}
}
