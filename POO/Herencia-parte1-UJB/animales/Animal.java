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

