package mision_tic_2022_interfaces_graficas;
public class Persona {
    private String documento, nombre, genero, tipodoc;
    private double peso, edad, estrato, altura;
    
    public String mostrardatos(){
        return "La persona de nombre: "+ nombre+" con genero de: "
                +genero+" con edad de "+edad+" con tipo de documento "
                +tipodoc+" -- "+documento+" tiene un peso de: "+peso
                +" y altura de "+altura+" pertenece al estrato "
                +estrato;
    }
    public double imc(){
        return peso/(altura*altura);
    }
    
    public Persona(String documento, String nombre, String genero, String tipodoc, double peso, double edad, double estrato, double altura) {
        this.documento = documento;
        this.nombre = nombre;
        this.genero = genero;
        this.tipodoc = tipodoc;
        this.peso = peso;
        this.edad = edad;
        this.estrato = estrato;
        this.altura = altura;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getEstrato() {
        return estrato;
    }

    public void setEstrato(double estrato) {
        this.estrato = estrato;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
