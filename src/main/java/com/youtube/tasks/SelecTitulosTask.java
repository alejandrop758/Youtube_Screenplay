package com.youtube.tasks;

import com.youtube.interactions.CancionSeleccionada;
import com.youtube.interactions.SelectRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelecTitulosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectRandom.click(),
                CancionSeleccionada.cancionselct()
        );
    }
    public static SelecTitulosTask selectAleatorio(){
        return instrumented(SelecTitulosTask.class);
    }
}
