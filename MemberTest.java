class MemberService{

	boolean login(String id, String password) {
		if(id.contentEquals("hong")&&password.contentEquals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("�α׾ƿ��Ǿ����ϴ�.");
	}
}
public class MemberTest {

	public static void main(String[] args) {
		MemberService memberService =new MemberService();
		boolean result =memberService.login("hong","12345");
		if(result) {
			System.out.println("�α��εǾ����ϴ�.");
			memberService.logout("hong");
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}

	}
}