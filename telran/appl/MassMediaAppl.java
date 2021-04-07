package telran.appl;

import telran.interfaces.IPrintable;
import telran.items.*;

public class MassMediaAppl {
    public static void main(String[] args) {
        MassMedia[] massM= {
                new Newspaper("Times",12,10),
                new Newspaper("Times",13,17),
                new Newspaper("Times",14,10),
                new Journal("Playboy",14,15,true),
                new Journal("The Lancet",112,153,false),
                new WebSite("Telran","wwww.telran.com","Telran"),
                new WebSite("Facebook","wwww.facebook.com","Mark Zuckerberg"),
                new WebSite("Facebook","wwww.facebook.com","Mark Zuckerberg"),
                new NewsPortal("DW","dw.com"),
                new NewsPortal("CNN","edition.cnn.com")
        };
        displayPrintable(massM);




    }
    private static void displayPrintable (MassMedia[] massM) {
        for (MassMedia ms : massM) {
            if (ms instanceof IPrintable)
                ((IPrintable) ms).print();
        }
    }

    private static IPrintable[] getPrintableElements(MassMedia[] massM){
        IPrintable[] arr = new IPrintable[];
        for(MassMedia ms : massM)
            if(ms instanceof IPrintable)
                //arr += ms;//How to add element to array
        return arr;

    }
}
