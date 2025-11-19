/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segundo_parcial;

/**
 *
 * @author sergi
 */
class MiTeleferico {
    private Linea[] lineas;
    private int cantLineas;
    private float cantidadIngresos;

    public MiTeleferico() {
        this.lineas = new Linea[10];
        this.cantLineas = 0;
        this.cantidadIngresos = 0;
    }

    public void agregarLinea(Linea l) {
        lineas[cantLineas++] = l;
    }

    public Linea buscarLinea(String color) {
        for (int i = 0; i < cantLineas; i++) {
            if (lineas[i].getColor().equalsIgnoreCase(color)) return lineas[i];
        }
        return null;
    }

    public void agregarPersonaFila(Persona p, String linea) {
        Linea l = buscarLinea(linea);
        if (l != null) l.agregarPersona(p);
    }

    public void agregarCabina(String linea, int nro) {
        Linea l = buscarLinea(linea);
        if (l != null) l.agregarCabina(nro);
    }

    //inciso a
    public void agregarPrimeraPersonaCabina(String linea, int nroCabina) {
        Linea l = buscarLinea(linea);
        if (l == null) throw new RuntimeException("La línea no existe.");

        Cabina[] cabs = l.getCabinas();
        Cabina cab = null;
        for (Cabina c : cabs) {
            if (c != null && c.getNroCabina() == nroCabina) {
                cab = c;
                break;
            }
        }
        if (cab == null) throw new RuntimeException("No hay la cabina");

        Persona p = l.obtenerPrimeroFila();
        if (p == null) throw new RuntimeException("No hay personas haciendo fila");

        cab.agregarPersona(p);
    }

    //inciso b
    public boolean verificarCabinas() {
        for (int i = 0; i < cantLineas; i++) {
            Cabina[] cabs = lineas[i].getCabinas();
            for (Cabina c : cabs) {
                if (c != null) {
                    if (c.getCantPersonas() > 10 || c.getPesoTotal() > 850) return false;
                }
            }
        }
        return true;
    }

    //inciso c
    public float calcularIngresos() {
        float total = 0;
        for (int i = 0; i < cantLineas; i++) {
            Cabina[] cabs = lineas[i].getCabinas();
            for (Cabina c : cabs) {
                if (c != null) {
                    for (Persona p : c.getPersonas()) {
                        if (p != null) {
                            if (p.getEdad() < 25 || p.getEdad() > 60)
                                total += 1.5f;
                            else
                                total += 3.0f;
                        }
                    }
                }
            }
        }
        cantidadIngresos = total;
        return total;
    }

    //inciso d
    public String lineaConMasRegular() {
        String lineaMax = "";
        float max = 0;

        for (int i = 0; i < cantLineas; i++) {
            float suma = 0;
            Cabina[] cabs = lineas[i].getCabinas();

            for (Cabina c : cabs) {
                if (c != null) {
                    for (Persona p : c.getPersonas()) {
                        if (p != null && p.getEdad() >= 25 && p.getEdad() <= 60)
                            suma += 3.0f;
                    }
                }
            }

            if (suma > max) {
                max = suma;
                lineaMax = lineas[i].getColor();
            }
        }
        return lineaMax;
    }
}

