package one;

public class Hero {
	String name;//name
	float hp;
	float armor;
	int moveSpeed;
	
	//��ȡ����ֵ
	float getArmor() {
		return armor;
	}
	
	//�Ӷ���
	void keng() {
		System.out.println("�Ӷ��ѣ�");
	}
	
	//����
	void legendary() {
		System.out.println("����");
	}
	
	//��ȡ��ǰѪ��
	float getHp() {
		return hp;
	}
	
	//��Ѫ
	float recovery(float blood) {
		if (445 < blood) {
			for(int i = 0; i < 445; i ++) {
				blood = blood + 1.5f;
			}
		}
		return blood;
	}
	
	void addSpeed(int speed) {
		//��ԭ�������������ƶ��ٶ�
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
