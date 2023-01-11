package chapter06;

public class TeamGroup {
	private TeamMember[] members = new TeamMember[6];

	public void init() {
		members[0] = new TeamMember("김창우", "남");
		members[1] = new TeamMember("정세나", "여");
		members[2] = new TeamMember("김우태", "남");
		members[3] = new TeamMember("박수연", "여");
		members[4] = new TeamMember("백유기", "남");
		members[5] = new TeamMember("박범준", "남");
	}

	public void display() {
		try {
			for (var member : members) {
				System.out.println(member.getName() + ", " + member.getGender());
			}
		} catch (NullPointerException e) {
			System.out.println("초기화 해야함");
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		}
	}
	
	public TeamMember getMember(int index) 
			throws NullPointerException, IndexOutOfBoundsException {
		return members[index];
	}
}
