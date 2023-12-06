package com.youtube.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.youtube.UI.ValidarCancionUI.LBL_SELECTCANCION;

public class ValidarCancionQuestions implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String validarCancion = LBL_SELECTCANCION.resolveFor(actor).getText();
        String cancionSeleccionada=actor.recall("Titulocancion");
        return cancionSeleccionada.equals(validarCancion);


    }
    public static Question<Boolean> from(){
        return new ValidarCancionQuestions();
    }
}
