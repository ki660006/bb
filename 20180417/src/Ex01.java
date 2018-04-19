
public class Ex01 {
	public static void main(String[] args) {
		
		HomeWork JeongA = new HomeWork();
		JeongA.doWork();
		HomeWork JeongB = new HomeWork();
		JeongB.doWork();
		
		
		System.out.println("JeongA 개인과제 한 횟수 : "+JeongA.private_subject_cnt);
		System.out.println("JeongA 공통과제 한 횟수 : "+JeongA.common_subject_cnt);
		
		System.out.println("JeongB 개인과제 한 횟수 : "+JeongB.private_subject_cnt);
		System.out.println("JeongB 공통과제 한 횟수 : "+JeongB.common_subject_cnt);
	}
}

class HomeWork {
	public int private_subject_cnt = 0;
	public static int common_subject_cnt = 0;
	public void doWork() {
		private_subject_cnt++;
		common_subject_cnt++;
	}
}