public class Cliente {
    public String nombre;
    public String apellido;
    public String DNI;
    public String Tipo_Cuenta;
    public int saldo;

    public Cliente(String nombre, String apellido, String DNI, String tipo_Cuenta, int saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        Tipo_Cuenta = tipo_Cuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTipo_Cuenta() {
        return Tipo_Cuenta;
    }

    public void setTipo_Cuenta(String tipo_Cuenta) {
        Tipo_Cuenta = tipo_Cuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
