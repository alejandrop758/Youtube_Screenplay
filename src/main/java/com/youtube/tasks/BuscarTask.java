package com.youtube.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.youtube.UI.BuscarUI.TXT_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarTask implements Task {
    private   static  String cancionSelected="Citrix";


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(cancionSelected).into(TXT_BUSCAR).thenHit(Keys.ENTER)

        );
    }
    public static BuscarTask canciones() {
        return instrumented(BuscarTask.class);
    }
    public static String getCancionSelected() {
        return cancionSelected;
    }
}
