package ATMLLD;

public interface CashDispenser {
    void setNextDispenser(CashDispenser nextDispenser);
    boolean canDispense(ATM atm,int amount);
    void dispense(ATM atm, int amount);
}
