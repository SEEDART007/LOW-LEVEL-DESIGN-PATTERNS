package ATMLLD;

public class TwoThousandDispenser implements CashDispenser{
    private CashDispenser next;

    public void setNextDispenser(CashDispenser next) {
        this.next = next;
    }
    public boolean canDispense(ATM atm, int amount){
        int count = atm.getTwoThousandCount();
        int notes = Math.min(amount/2000,count);
        int remainder = amount-notes*2000;
        return remainder==0 || (next!=null && next.canDispense(atm,amount));
    }
    public void dispense(ATM atm, int amount){
        int count = atm.getTwoThousandCount();
        int notes = Math.min(amount/2000,count);
        atm.setTwoThousandCount(count-notes);
        int remainder = amount-notes*2000;
        if(notes>0) {
            System.out.println("Dispensed "+notes +" x 2000 notes");
        }
        if(remainder>0 && next!=null){

        }

    }
}
