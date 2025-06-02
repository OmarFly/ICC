public class Carta {
    public enum Estado {GRANDE, PEQUENO, CLARO, OSCURO, UN_BRAZO, DOS_BRAZOS, CON_LENTES, SIN_LENTES, CON_PALOMITAS, SIN_PALOMITAS}
    
    private boolean grande;
    private boolean claro;
    private boolean unBrazo;
    private boolean conLentes;
    private boolean conPalomitas;

    public Carta(boolean grande, boolean claro, boolean unBrazo, boolean conLentes, boolean conPalomitas) {
        this.grande = grande;
        this.claro = claro;
        this.unBrazo = unBrazo;
        this.conLentes = conLentes;
        this.conPalomitas = conPalomitas;
    }

    public int comparar(Carta otra) {
        int diferencias = 0;
        if (this.grande != otra.grande) diferencias++;
        if (this.claro != otra.claro) diferencias++;
        if (this.unBrazo != otra.unBrazo) diferencias++;
        if (this.conLentes != otra.conLentes) diferencias++;
        if (this.conPalomitas != otra.conPalomitas) diferencias++;
        return diferencias;
    }

    @Override
    public String toString() {
        return (grande ? "Grande" : "Pequeno") + ", " +
               (claro ? "Claro" : "Oscuro") + ", " +
               (unBrazo ? "UnBrazo" : "DosBrazos") + ", " +
               (conLentes ? "ConLentes" : "SinLentes") + ", " +
               (conPalomitas ? "ConPalomitas" : "SinPalomitas");
    }

    public boolean esIgual(Carta otra) {
        return this.comparar(otra) == 0;
    }

    public boolean esSecuencial(Carta otra) {
        return this.comparar(otra) <= 1;
    }
}
