package Observer;
/*
The Subject maintains a list of Observers and,
whenever an event occurs, it invokes a method on each of them to notify the change.
This example represents the most essential form of the Observer Pattern:
You have an object acting as the subject (the Notifier).
You have multiple objects that wish to be notified, i.e., the observers
(EmailNotification, SmsNotification).
When something happens (eventOccured), the subject notifies all subscribed observers
through a single call (sendAllNotifications()).

Developed by: @Simone Remoli
*/


public class Notifier extends Subject {

    private String statoPagamento;
    private int numeroOrdini;

    public void setStatoPagamento(String nuovoStato) {
        this.statoPagamento = nuovoStato;

        System.out.println(" [Stato pagamento aggiornato:] " + nuovoStato);

        // Notifica: solo questa proprietà è cambiata
        notifyObservers(EventType.STATO_PAGAMENTO_CAMBIATO);
    }

    public void setNumeroOrdini(int nuovoValore) {
        this.numeroOrdini = nuovoValore;

        System.out.println(" [Numero ordini aggiornato:]" + nuovoValore);

        // Notifica: solo questa proprietà è cambiata
        notifyObservers(EventType.NUMERO_ORDINI_CAMBIATO);
    }

    public String getStatoPagamento() {
        return statoPagamento;
    }

    public int getNumeroOrdini() {
        return numeroOrdini;
    }
}
