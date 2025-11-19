package MemberContainer;

public class Client {

    public static void main(String[] args) {
        try {

            MemberContainer container = MemberContainer.getInstance();

            Member member3 = new ConcreteMember(3);
            Member member4 = new ConcreteMember(4);
            container.addMember(member3);
            container.addMember(member4);


            MemberView memberView = new MemberView();
            memberView.dump(container.getCurrentList());


        } catch (ContainerException e) {
            e.getMessage();
        }
    }
}
