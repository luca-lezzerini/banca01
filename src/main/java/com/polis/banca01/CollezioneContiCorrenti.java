package com.polis.banca01;

import java.util.ArrayList;
import java.util.List;

public class CollezioneContiCorrenti {

    private ArrayList<ContoCorrente> collezioneConti = new ArrayList<>();

    /**
     * Trova il conto corrente che ha lo stesso IBAN di quello passato
     *
     * @param iban l'IBAN da cercare
     * @return il conto trovato o null se non trova nulla
     */
    public ContoCorrente getContoByIBAN(String iban) {
        // cicla su tutti i conti (for)
        for (int i = 0; i < collezioneConti.size(); i++) {
            ContoCorrente cc = collezioneConti.get(i);
            // ritorna il primo che ha l'iban uguale a quello passato
            if (cc.getIban().equalsIgnoreCase(iban)) {
                return cc;
            }
        }
        // oppure ritorna null se non trova nessun conto con quell'IBAN
        return null;
    }

    /**
     * Restituisce tutti i conti, ossia l'intera collezione
     *
     * @return la collezione con tutti i conti
     */
    public List<ContoCorrente> getAllConti() {
        return collezioneConti;
    }

    public List<ContoCorrente> getContoByCliente(String codFis) {
        return null;
    }

    /**
     * Aggiunge un conto corrente alla collezione di conti correnti
     *
     * @param c conto da aggiungere alla collezione
     */
    public void addContoCorrente(ContoCorrente c) {
        collezioneConti.add(c);
    }

    /**
     * cancella il conto corrente
     *
     * @param c
     */
    public void removeContoCorrente(ContoCorrente c) {
        return;
    }
}
