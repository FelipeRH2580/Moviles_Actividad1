class Animal {
    void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }
}


// Subclase que hereda de Animal
class Perro extends Animal {
    // Sobrecarga del método hacerSonido en la subclase
    void hacerSonido(String ladrido, int intensidad) {
        System.out.println("Ladrido: " + ladrido + ", Intensidad: " + intensidad);
    }
}

// Subclase adicional que hereda de Animal
class Gato extends Animal {
    // Sobrecarga del método hacerSonido en la subclase
    void hacerSonido(String maullido, int intensidad) {
        System.out.println("Maullido: " + maullido + ", Intensidad: " + intensidad);
    }
}

class Vaca extends Animal {
    // Sobrecarga del método hacerSonido en la subclase
    void hacerSonido(String mugido, int intensidad) {
        System.out.println("Mugido: " + mugido + ", Intensidad: " + intensidad);
    }
}