package animales;

public class Animal {
    public void comer(){
        System.out.println("Como muchas veces al dia");
    }

    public void dormir(){
        System.out.println("Duermo muchas horas");
    }
} // fin Clase Animal

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }
}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Herencia ***");
        System.out.println("Clase Padre, soy un Animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        //animal1.hacerSonido(); // este metodo no existe en la clase padre

        System.out.println("\nClase Hija, soy un Perro");
        var perro1 = new Perro();
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();
    }
}
