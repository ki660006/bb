
public class Gamemain {

	public static void main(String[] args) {

		Person p1 = new Person();
		Monster m1 = new Monster();
		rabbit r1 = new rabbit();
		r1.name = "토끼";
		
		
		
		while (true) {
			p1.doAmon(m1);
			m1.doAps(p1);
			if(p1.hp<0) {
				System.out.println("사람 죽음");
				break;
			}
			else if(m1.hp<0) {
				System.out.println("몬스터 죽음");
				break;
			}
		}

	}
}


class rabbit extends Monster{
	
}

class 

