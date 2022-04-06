package com.polis.banca01;

import java.util.List;

public class TestConti01 {

    public static void main(String[] args) {
        CollezioneContiCorrenti coll = new CollezioneContiCorrenti();

        ContoCorrente c1 = new ContoCorrente("1234567890", 1000);
        coll.addContoCorrente(c1);

        ContoCorrente c2 = new ContoCorrente("sdkjgaklölhgr", 8000);
        coll.addContoCorrente(c2);
        coll.addContoCorrente(new ContoCorrente("ib1", 5));
        coll.addContoCorrente(new ContoCorrente("ib7", 12));
        coll.addContoCorrente(new ContoCorrente("ib10", 15));

        List<ContoCorrente> lista = coll.getAllConti();
        for (int i = 0; i < lista.size(); i++) {
            ContoCorrente cc = lista.get(i);
            System.out.println("Conto corrente " + cc);
        }

        ContoCorrente trovato = coll.getContoByIBAN("ib1");
        stampaEsitoRicerca(trovato);
        trovato = coll.getContoByIBAN("IB1");
        stampaEsitoRicerca(trovato);
        trovato = coll.getContoByIBAN("Fulgenzio");
        stampaEsitoRicerca(trovato);
    }

    private static void stampaEsitoRicerca(ContoCorrente trovato) {
        if (trovato != null) {
            System.out.println("Ho trovato " + trovato);
        } else {
            System.out.println("Non ho trovato il conto che ceravi");
        }
    }

}
