package com.youtube.interactions;
/*
 * @(#) SelectRandom.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;


import static com.youtube.UI.TitulosCancionUI.LBL_TICANCIONES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class SelectRandom implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listProducts = LBL_TICANCIONES.resolveAllFor(actor);
        Random random= new Random();
        int indexRandom= random.nextInt(listProducts.size());

        listProducts.get(indexRandom).click();
    }

    public static Performable click(){
        return instrumented(SelectRandom.class);
    }


}