package maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {

    @FindBy(css = "*[id=name]")
    public WebElement inpNome;

    @FindBy(css = "*[id=email]")
    public WebElement inpEmail;

    @FindBy(css = "*[id=password]")
    public WebElement inpSenha;

    @FindBy(css = "*[id=register]")
    public WebElement btnCadastrar;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/h2[2]")
    public WebElement txtCadastrado;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/div[1]/p")
    public WebElement txtNomeInvalido;


    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/div[2]/p")
    public WebElement txtEmailInvalido;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/form/div[3]/p")
    public WebElement txtSenhaInvalida;


}
