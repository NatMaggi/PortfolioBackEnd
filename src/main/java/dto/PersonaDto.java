
package dto;

public class PersonaDto {
    private String nombre;
    private String apellido;
    private String edad;
    private String telefono;
    private String correo;
    private String sobre_mi;
    private String url_foto;
    private String posicion;
    private String banner;

    public PersonaDto() {
    }

    public PersonaDto(String nombre, String apellido, String edad, String telefono, String correo, String sobre_mi, String url_foto, String posicion, String banner) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
        this.posicion = posicion;
        this.banner = banner;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getSobre_mi() {
        return sobre_mi;
    }

    public String getUrl_foto() {
        return url_foto;
    }

    public String getPosicion() {
        return posicion;
    }

    public String getBanner() {
        return banner;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSobre_mi(String sobre_mi) {
        this.sobre_mi = sobre_mi;
    }

    public void setUrl_foto(String url_foto) {
        this.url_foto = url_foto;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }
    
}
