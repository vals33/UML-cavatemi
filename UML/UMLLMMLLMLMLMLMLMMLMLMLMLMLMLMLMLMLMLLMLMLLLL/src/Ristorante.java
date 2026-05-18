public class Ristorante {
    private String nome;
    private Indirizzo indirizzo;
    private String codFiscaleGestore;
    public Ristorante(String nome, Indirizzo indirizzo, String codFiscaleGestore) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.codFiscaleGestore = codFiscaleGestore;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Indirizzo getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }
    public String getCodFiscaleGestore() {
        return codFiscaleGestore;
    }
    public void setCodFiscaleGestore(String codFiscaleGestore) {
        this.codFiscaleGestore = codFiscaleGestore;
    }
}
