package MemberContainer;

import java.io.Serializable;

public class ConcreteMember implements Member, Serializable {

    private final Integer id;

    public ConcreteMember(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getID() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Member (ID = " + id + ")";
    }

}
