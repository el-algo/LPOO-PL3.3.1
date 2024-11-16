// Interface para las habilidades que un personaje puede tener
interface Skillful {
    void useSkill();
}

// Clase abstracta para un Personaje genérico en el juego
abstract class Character {
    String name;
    int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Método abstracto que todos los personajes deben implementar
    abstract void action();

    // Método común para todos los personajes
    public void showStatus() {
        System.out.println(name + " tiene " + health + " puntos de vida.");
    }
}

// Clase específica que hereda de Character y también implementa la interfaz
// Skillful
class Detective extends Character implements Skillful {
    public Detective(String name, int health) {
        super(name, health);
    }

    // Implementación de una acción específica del detective
    @Override
    public void action() {
        System.out.println(name + " investiga la escena del crimen en busca de pistas.");
    }

    // Implementación del uso de una habilidad especial
    @Override
    public void useSkill() {
        System.out.println(name + " usa una habilidad especial: ¡Interrogatorio persuasivo!");
    }
}

// Clase específica que hereda de Character y también implementa la interfaz
// Skillful
class Criminal extends Character implements Skillful {
    public Criminal(String name, int health) {
        super(name, health);
    }

    // Implementación de una acción específica del criminal
    @Override
    public void action() {
        System.out.println(name + " intenta escapar de la escena del crimen.");
    }

    // Implementación del uso de una habilidad especial
    @Override
    public void useSkill() {
        System.out.println(name + " usa una habilidad especial: ¡Desaparición en la oscuridad!");
    }
}

// Clase principal de la aventura de texto
public class TextAdventure {
    public static void main(String[] args) {
        // Crear un detective y un criminal
        Detective detective = new Detective("Sherlock", 100);
        Criminal criminal = new Criminal("Moriarty", 80);

        System.out.println();

        // Mostrar estado inicial
        detective.showStatus();
        criminal.showStatus();

        // Realizar algunas acciones
        detective.action();
        detective.useSkill();

        criminal.action();
        criminal.useSkill();
    }
}
