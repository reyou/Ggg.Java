package org.gamegogo.TheConcurrencyUtilities.UsingSynchronizationObjects.ExchangerExample;

// An example of Exchanger.
import java.util.concurrent.Exchanger;
class ExgrDemo {
    public static void main(String args[]) {
        Exchanger<String> exgr = new Exchanger<String>();
        new UseString(exgr);
        new MakeString(exgr);
    }
}

