package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public short dorsal;
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, short dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    public Jugador(short golesMarcados, short dorsal) {
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    public Jugador(){
        this.golesMarcados = 286;
        this.dorsal = 7;
    }

    // @Override
    public int compareTo(Jugador futbolista) {
        return Math.abs(this.getEdad() - futbolista.getEdad());
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + "tiene " + getEdad() + ", y juega de " + getPosicion() +
        " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }

    @Override
    public boolean jugarConLasManos() {
        return false;
    }
    public short getGolesMarcados() {
        return golesMarcados;
    }
    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }
    public short getDorsal() {
        return dorsal;
    }
    public void setDorsal(short dorsal) {
        this.dorsal = dorsal;
    }

    
}
