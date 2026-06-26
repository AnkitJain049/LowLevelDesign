package com.lld.projects.atm.ATMStates;

import com.lld.projects.atm.ATMRoomComponents.ATM;
import com.lld.projects.atm.ATMRoomComponents.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}