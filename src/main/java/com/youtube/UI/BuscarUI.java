package com.youtube.UI;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarUI {

    public static Target TXT_BUSCAR=Target.the("input Buscar")
            .locatedBy("//input[@id='search']");
}
