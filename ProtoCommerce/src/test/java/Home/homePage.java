package Home;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class homePage extends PageObject {
    private By fieldName() {
        return By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input");
    }

    private By fieldEmail() {
        return By.xpath("/html/body/app-root/form-comp/div/form/div[2]/input");
    }

    private By fieldPassword() {
        return By.xpath("//input[@type='password']");
    }

    private By fieldGender() {
        return By.xpath("//select[@id='exampleFormControlSelect1']");
    }

    private By selectGender() {
        return By.xpath("///option[text()='Male']");
    }

    private By checkbox() {
        return By.xpath("//input[@type='checkbox']");
    }

    private By employmentStatus() {
        return By.xpath("//input[@value='option1']");
    }

    private By fieldDateOfBirth() {
        return By.xpath("//input[@type='date']");
    }

    private By submitButton() {
        return By.xpath("//input[@value='Submit']");
    }

    private By successMessage() {
        return By.xpath("//*[@Class='alert alert-success alert-dismissible']");
    }

    @Step
    public void inputFieldName(String name) {
        $(fieldName()).type(name);
    }

    @Step
    public void inputFieldEmail(String email) {
        $(fieldEmail()).type(email);
    }

    @Step
    public void inputFieldPassword(String password) {
        $(fieldPassword()).type(password);
    }

    @Step
    public void inputFieldGender() {
        $(fieldGender()).click();
        $(selectGender()).select();
    }

    @Step
    public void selectChekbox() {
        $(checkbox()).click();
    }

    @Step
    public void selectEmploymentStatus() {
        $(employmentStatus()).click();
    }

    @Step
    public void inputFieldDateOfBirth(String birth) {
        $(fieldDateOfBirth()).click();
        $(fieldDateOfBirth()).type(birth);
    }

    @Step
    public void clickSubmitButton() {
        $(submitButton()).click();
    }

    @Step
    public void validateSuccessMessage() {
        $(successMessage()).isDisplayed();
    }

}
