package steps;

import core.Driver;
import enums.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.LoginPage;

import java.io.IOException;
import java.util.Map;

public class CadastroSteps {
    LoginPage loginPage;

    @Before
    public void iniciaNavegador(Scenario cenario) {
        new Driver(Browser.CHROME);
        System.out.println(cenario.getName());
        Driver.setNomeCenario(cenario.getName());
        Driver.criaDiretorio();
    }

    @After
    public void fechaNavegador(Scenario scenario) {
        Driver.getDriver().quit();
    }


    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
        Driver.getDriver().get("http://prova.stefanini-jgr.com.br/teste/qa/");
        loginPage = new LoginPage();

    }

    @Quando("os campos sejam preenchidos da seguinte forma")
    public void osCamposSejamPreenchidosDaSeguinteForma(Map<String, String> map) throws IOException {
        String nome = map.get("nome");
        String email = map.get("email");
        String senha = map.get("senha");

        loginPage.inpNome(nome);
        loginPage.inpEmail(email);
        loginPage.inpSenha(senha);

        Driver.printScreen("preenchendo os campos");

    }

    @Quando("clicar no botao cadastrar")
    public void clicarNoBotaoCadastrar() throws IOException {
        loginPage.btnCadastrar();

        Driver.printScreen("clicar no botao cadastrar");

    }

    @Entao("deve cadastrar usuario no sistema")
    public void deveCadastrarUsuarioNoSistema() throws IOException {
        Assert.assertEquals("Usuários cadastrados", loginPage.getCadastrado());

        Driver.printScreen("usuario cadastrado");
    }

    @Entao("o sistema deve exibir mensagem de validacao")
    public void oSistemaDeveExibirMensagemDeValidacao() throws IOException {
        Assert.assertEquals("Por favor, insira um nome completo.", loginPage.getErroNome());
        /*Assert.assertEquals("Por favor, insira um e-mail válido.", loginPage.getErroEmail());
        Assert.assertEquals("A senha deve conter ao menos 8 caracteres.", loginPage.getErroSenha());
        ToDo ficou pendente as validações de email e senha
        */
        Driver.printScreen("nome invalido");
    }

}
