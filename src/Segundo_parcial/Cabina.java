/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segundo_parcial;

/**
 *
 * @author sergi
 */
class Cabina {
    private int nroCabina;
    private Persona[] personaAbordo;
    private int cantPersonas;

    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        this.personaAbordo = new Persona[10]; // máx 10 personas
        this.cantPersonas = 0;
    }

    public float getPesoTotal() {
        float total = 0;
        for (int i = 0; i < cantPersonas; i++) {
            total += personaAbordo[i].getPeso();
        }
        return total;
    }

    public int getCantPersonas(){
        return cantPersonas;
    }

    public Persona[] getPersonas(){
        return personaAbordo;
    }

    public int getNroCabina(){
        return nroCabina;
    }

    public void agregarPersona(Persona p) {
        if (cantPersonas < 10 && getPesoTotal() + p.getPeso() <= 850) {
            personaAbordo[cantPersonas++] = p;
        } else {
            throw new RuntimeException("Limite de capacidad o peso");
        }
    }
}
