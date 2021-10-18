package designPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wql
 * @desc PartyImpl
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class PartyImpl implements Party {

    private final List<PartyMember> members;

    public PartyImpl() {
        members = new ArrayList<>();
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for (PartyMember member : members) {
            if (!member.equals(actor)) {
                member.partyAction(action);
            }
        }
    }

    @Override
    public void addMember(PartyMember member) {
        members.add(member);
        member.joinedParty(this);
    }
}
