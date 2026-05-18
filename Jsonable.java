public interface Jsonable {
    public String toJson();
    public static Object fromJson(String rawJson) {
        // Implementazione per deserializzare un oggetto JSON in un'istanza di una classe che implementa Jsonable
        // Questa è solo una struttura di esempio e dovrebbe essere implementata in base alle esigenze specifiche
        return null; // Restituisce null come segnaposto, da implementare correttamente
    }
}
