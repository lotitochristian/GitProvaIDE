public class Automobile {
    private String marca;
    private String modello;
    private int anno;

    public Automobile(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", anno=" + anno +
                '}';
    }
}

