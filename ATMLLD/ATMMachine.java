package ATMLLD;

public class ATMMachine {

    private final ATM atm;
    private ATMState state;
    private final ATMRepository atmRepository;
    private Card currentCard;

    public ATMMachine(String atmId, ATMRepository atmRepository) {
        this.atmRepository = atmRepository;

        this.atm = atmRepository.getById(atmId)
                .orElseThrow(() -> new RuntimeException("ATM not found"));

        this.state = ATMStateFactory.getState(atm.getStatus(), this);
    }

    public ATM getAtm() {
        return atm;
    }

    public ATMState getState() {
        return state;
    }

    public ATMRepository getAtmRepository() {
        return atmRepository;
    }

    public Card getCurrentCard() {
        return currentCard;
    }

    public void setCurrentCard(Card currentCard) {
        this.currentCard = currentCard;
    }

    public void insertCard(Card card) {
        state.insertCard(card);
    }

    public void enterPin(String pin) {
        state.enterPin(pin);
    }

    public void selectOption(String option) {
        state.selectOption(option);
    }

    public void dispenseCash(int amount) {
        state.dispenseCash(amount);
    }

    public void ejectCard() {
        state.ejectCard();
    }

    public void setState(ATMState state) {
        this.state = state;
        this.atm.setStatus(state.getStatus());

        // Persist the changes in DB
    }
}