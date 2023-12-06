package com.youtube.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static com.youtube.UI.TitulosCancionUI.LBL_TICANCIONES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CancionSeleccionada implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        String saveCancion = LBL_TICANCIONES.resolveFor(actor).getText();
        actor.remember("Titulocancion",saveCancion);

    }
    public static CancionSeleccionada cancionselct(){
        return instrumented(CancionSeleccionada.class);
    }
}
