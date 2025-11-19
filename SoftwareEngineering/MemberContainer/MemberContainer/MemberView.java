package MemberContainer;

import java.util.List;

public class MemberView {

    // Methode zur Ausgabe der Member-Objekte
    public void dump(List<Member> memberList) {
        for (Member member : memberList) {
            System.out.println(member.toString());
        }
    }
}

