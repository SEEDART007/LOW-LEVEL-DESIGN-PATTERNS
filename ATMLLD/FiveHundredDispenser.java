package ATMLLD;

public class FiveHundredDispenser implements CashDispenser{
    private CashDispenser next;

    public void setNextDispenser(CashDispenser next) {
        this.next = next;
    }
    public boolean canDispense(ATM atm, int amount){
        int count = atm.getFiveHundredCount();
        int notes = Math.min(amount/500,count);
        int remainder = amount-notes*500;
        return remainder==0 || (next!=null && next.canDispense(atm,amount));
    }
    public void dispense(ATM atm, int amount){
        int count = atm.getFiveHundredCount();
        int notes = Math.min(amount/500,count);
        atm.setFiveHundredCount(count-notes);
        int remainder = amount-notes*5000;
        if(notes>0) {
            System.out.println("Dispensed "+notes +" x 500 notes");
        }
        if(remainder>0 && next!=null){

        }

    }
}
