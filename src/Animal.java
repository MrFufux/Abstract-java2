public abstract class Animal {

    //definimos variables
    private String nombre;

    //Definimos constructores
    public Animal(){
    }

    //definimos metodos
    public void comer(){
        System.out.println("El "+ nombre +" esta comiendo.");
    }

    //definimos un metodo abstracto
    /*Este metodo necesita ser implementado en una clase que herede de la clase padre*/
    public abstract void moverse();

    public String setNombre(String nombre) {
        return this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
