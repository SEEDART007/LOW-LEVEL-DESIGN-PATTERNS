package ATMLLD;

public class ATMStateFactory{

    public static ATMState getState(ATMStatus status, ATMMachine machine) {

        switch (status) {
            case IDLE:
                return new IdleState(machine);

            case CARD_INSERTED:
                return new CardInsertedState(machine);

            case AUTHENTICATED:
                return new AuthenticatedState(machine);

            case DISPENSE_CASH:
                return new DispenseCashState(machine);

            default:
                throw new IllegalArgumentException("Unknown ATM status: " + status);
        }
    }
}
