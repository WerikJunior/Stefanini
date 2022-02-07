package pages;

import core.Driver;
import maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void btnCadastrar(){
        loginMap.btnCadastrar.click();
    }

    public void inpNome(String nome)    {
        loginMap.inpNome.sendKeys(nome);
    }

    public void inpEmail(String email)
    {
        loginMap.inpEmail.sendKeys(email);

    }

    public void inpSenha(String senha)
    {
        loginMap.inpSenha.sendKeys(senha);

    }

    public String getCadastrado(){
        return loginMap.txtCadastrado.getText();
    }

    public String getErroNome(){
        return loginMap.txtNomeInvalido.getText();
    }

    public String getErroEmail(){
        return loginMap.txtEmailInvalido.getText();
    }

    public String getErroSenha(){
        return loginMap.txtSenhaInvalida.getText();
    }
}
