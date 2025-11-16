package Observer;

public class SmsNotification implements Observer {

    private final Notifier notifier;

    public SmsNotification(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void update(EventType eventType) {

        switch (eventType) {

            case STATO_PAGAMENTO_CAMBIATO:
                System.out.println(" SMS: stato pagamento aggiornato : " +
                        notifier.getStatoPagamento());
                break;

            case NUMERO_ORDINI_CAMBIATO:
                System.out.println(" SMS: numero ordini aggiornato : " +
                        notifier.getNumeroOrdini());
                break;
        }
    }
}
