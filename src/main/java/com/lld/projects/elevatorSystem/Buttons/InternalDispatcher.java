package com.lld.projects.elevatorSystem.Buttons;

import com.lld.projects.elevatorSystem.ElevatorController;

public class InternalDispatcher {

    private static InternalDispatcher INSTANCE = new InternalDispatcher();

    private InternalDispatcher() {}

    public static InternalDispatcher getInstance() {
        return INSTANCE;
    }

    // elevatorController is known based on button press origin
    public void submitInternalRequest(int destinationFloor, ElevatorController controller) {
        controller.submitRequest(destinationFloor);
    }
}
