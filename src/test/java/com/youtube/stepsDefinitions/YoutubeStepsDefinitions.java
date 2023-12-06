package com.youtube.stepsDefinitions;

import com.youtube.questions.ValidarCancionQuestions;
import com.youtube.tasks.AbrirNavegadorTask;
import com.youtube.tasks.BuscarTask;
import com.youtube.tasks.SelecTitulosTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class YoutubeStepsDefinitions {

    @Before
    public void setupActor() {
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingrese a youtube")
    public void queElUsuarioIngreseAYoutube() {
        theActorCalled("user").wasAbleTo(
                AbrirNavegadorTask.navegador()
        );

    }
    @Cuando("busca una cancion y la selecciona aleatoriamente")
    public void buscaUnaCancionYLaSeleccionaAleatoriamente() {

        theActorCalled("user").attemptsTo(
                BuscarTask.canciones(),
                SelecTitulosTask.selectAleatorio()
        );

    }
    @Entonces("el usuario debera visualizar el titulo de la cancion seleccionada")
    public void elUsuarioDeberaVisualizarElTituloDeLaCancionSeleccionada() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidarCancionQuestions.from(),
                        Matchers.equalTo(true)
                )

        );
    }
}
