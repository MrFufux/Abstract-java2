public class Gato extends Animal{

    //implementacion del metodo moverse
    @Override
    public void moverse() {
        System.out.println("El gato se esta moviendo");
    }

    //constructor
    public Gato(){
        super(); //Ejecuta el codigo del constructor de la supeClase
        setNombre("Gato"); //Nombre por defecto
    }

}
