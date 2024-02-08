

public class Principal {
    public static void main(String[] args) {
        // Crear instancias de las subclases
        Animal animalGenerico = new Animal();
        Perro miPerro = new Perro();
        Gato miGato = new Gato();
        Vaca miVaca = new Vaca();

        // Polimorfismo: Utilizar la referencia de la superclase para referenciar a las subclases
        Animal animal1 = miPerro;
        Animal animal2 = miGato;
        Animal animal3 = miVaca;

        // Llamada al método hacerSonido utilizando polimorfismo
        animal1.hacerSonido();  // Llama al ladrido del perro
        animal2.hacerSonido();  // Llama al maullido del gato
        animal3.hacerSonido();

        // Sobrecarga de métodos
        miPerro.hacerSonido("Guau", 2);  // Llama al ladrido del perro
        miGato.hacerSonido("Miau", 2);  // Llama al maullido del gato con intensidad
        miVaca.hacerSonido("Muu", 4);

        // Llamada al método hacerSonido de la superclase  // Llama al sonido genérico de animal
    }
}