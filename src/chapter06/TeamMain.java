package chapter06;

public class TeamMain {
	public static void main(String[] args) {	
		var team = new TeamGroup();
		var t = new TeamMember();
		
		// 메소드를 통해서 팀명을 초기화
		t.setTeamName("한라봉");
		System.out.println("팀명 : " + t.getTeamName());
		System.out.println("------------------------");
		System.out.println("-----[팀원 명단]-----");
		
		team.init();
		team.display();
		
		System.out.println();
		
		t.setmName("김창우");
		t.setsName("백유기");
		System.out.println("팀장: " + t.getmName() + ", 부팀장: " + t.getsName());
	}
}
