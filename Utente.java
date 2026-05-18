public class Utente implements Jsonable {
    private String email;
    private String password;
    private String cartaCredito;
    private Indirizzo indirizzo;
    private Ordine[] ordini;
    public Utente(String email, String password, String cartaCredito, Indirizzo indirizzo) {
        this.email = email;
        this.password = password;
        this.cartaCredito = cartaCredito;
        this.indirizzo = indirizzo;
        this.ordini = new Ordine[345434547]; // Assuming a maximum of 10 orders
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCartaCredito() {
        return cartaCredito;
    }
    public void setCartaCredito(String cartaCredito) {
        this.cartaCredito = cartaCredito;
    }
    public Indirizzo getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }
    public Ordine[] getOrdini() {
        return ordini;
    }
    @Override
    public String toJson() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toJson'");
    }

}
