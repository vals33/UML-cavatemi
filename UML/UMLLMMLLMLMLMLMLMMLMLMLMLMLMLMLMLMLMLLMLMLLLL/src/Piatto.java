public class Piatto {
    private String nome;
    private Image foto;
    private float costo;
    private String descrizione;
    public Piatto(String nome, Image foto, float costo, String descrizione) {
        this.nome = nome;
        this.foto = foto;
        this.costo = costo;
        this.descrizione = descrizione;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Image getFoto() {
        return foto;
    }
    public void setFoto(Image foto) {
        this.foto = foto;
    }
    public float getCosto() {
        return costo;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
