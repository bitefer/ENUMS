package Atributo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Empresa e = new Empresa();
        e.agregarPersona(new Persona("Pepe", "Perez",NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Juan", "Peres",NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Jose", "Lopez",NivelEstudio.TERCIARIO));
        e.agregarPersona(new Persona("Ana", "Lopes",NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Rosio", "Sanchez",NivelEstudio.PRIMARIO));
        e.agregarPersona(new Persona("Alex", "Sanches",NivelEstudio.UNIVERSITARIO));
        e.agregarPersona(new Persona("Alex", "Sanches",NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Alex", "Sanches",NivelEstudio.SECUNDARIO));

        e.mostrarporNivel(NivelEstudio.SECUNDARIO);




    }
}
