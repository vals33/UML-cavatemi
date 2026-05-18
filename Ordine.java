public class Ordine implements Jsonable {
    private int numero;
    private DateTime dataOra;
    private Ristorante ristorantr;
    private Piatto[] piatti;
    public Ordine(int numero, DateTime dataOra, Ristorante ristorantr) {
        this.numero = numero;
        this.dataOra = dataOra;
        this.ristorantr = ristorantr;
        this.piatti = new Piatto[0];
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public DateTime getDataOra() {
        return dataOra;
    }
    public void setDataOra(DateTime dataOra) {
        this.dataOra = dataOra;
    }
    public Ristorante getRistorantr() {
        return ristorantr;
    }
    public void setRistorantr(Ristorante ristorantr) {
        this.ristorantr = ristorantr;
    }
    public Piatto[] getPiatti() {
        return piatti;
    }
    public void setPiatti(Piatto[] piatti) {
        this.piatti = piatti;
    }
    @Override
    public String toJson() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toJson'");
    }


}
