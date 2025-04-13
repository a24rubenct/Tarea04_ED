package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite realizar operaciones como consultar saldo, ingresar y retirar dinero.
 */
public class CCuenta {

    /** Nombre del titular de la cuenta. */
    private String nombre;

    /** Número de cuenta del titular. */
    private String cuenta1;

    /** Saldo actual de la cuenta. */
    private double saldo;

    /** Tipo de interés aplicado a la cuenta. */
    private double tipoInteres;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor parametrizado que inicializa los atributos de la cuenta.
     * 
     * @param nombre Nombre del titular.
     * @param cuenta1 Número de cuenta.
     * @param saldo Saldo inicial de la cuenta.
     * @param tipoInteres Tipo de interés aplicado.
     */
    public CCuenta(String nombre, String cuenta1, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta1 = cuenta1;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return Saldo actual.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     * 
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o excede el saldo disponible.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    // Getters y setters con JavaDoc para cada atributo.

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta del titular.
     * 
     * @return Número de cuenta.
     */
    public String getCuenta1() {
        return cuenta1;
    }

    /**
     * Establece el número de cuenta del titular.
     * 
     * @param cuenta1 Número de cuenta.
     */
    public void setCuenta1(String cuenta1) {
        this.cuenta1 = cuenta1;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return Saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo Nuevo saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return Tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInteres Nuevo tipo de interés.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
