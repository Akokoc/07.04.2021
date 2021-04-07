package telran.items;

import telran.interfaces.IPrintable;

public class Journal extends Newspaper implements IPrintable {
    boolean glossy;

    public Journal(String name, int issueNumber, int numberOfPages, boolean glossy) {
        super(name, issueNumber, numberOfPages);
        this.glossy = glossy;
    }

    public Journal(){

    }

    public boolean isGlossy() {
        return glossy;
    }

    public void setGlossy(boolean glossy) {
        this.glossy = glossy;
    }

    @Override
    public void print() {
        System.out.println("Journal: "+name);
    }
}
