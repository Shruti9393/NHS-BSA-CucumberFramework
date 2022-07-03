package nhs.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nhs.pages.*;
import org.junit.Assert;

public class MyNhsSteps {
    @Given("^I am on home page of NHS$")
    public void iAmOnHomePageOfNHS() {

    }

    @When("^I click on accpet cookies$")
    public void iClickOnAccpetCookies() {
       new HomePage().clickOnCookies();
    }

    @And("^I click on start button$")
    public void iClickOnStartButton() {
        new HomePage().clickOnStartButton();
    }

    @And("^I select my country$")
    public void iSelectMyCountry() {
        new CountryPage().clickOnWhichCountryToLiveIn();
    }

    @And("^I click on nextbutton for country$")
    public void iClickOnNextbuttonForCountry()
    {
        new CountryPage().clickOnNextButton();
    }

    @And("^I select my GP Practice$")
    public void iSelectMyGPPractice() {
        new GpPracticePage().clickOnGPService();
    }

    @And("^I click on next button for Gp Practice$")
    public void iClickOnNextButtonForGpPractice() {
    new GpPracticePage().clickOnNextButton1();
    }

    @And("^I select my Dental Practice$")
    public void iSelectMyDentalPractice()
    {
new DentalPracticePage().clickOnDentalPractice();
    }

    @And("^I click on next button for dental practice$")
    public void iClickOnNextButtonForDentalPractice() {
    new  DentalPracticePage().clickOnNextButton2();
    }

    @And("^I enter my Date Of Birth$")
    public void iEnterMyDateOfBirth() {
        new DateOfBirthPage().setDate("1");
    }

    @And("^I enter my month Of Birth$")
    public void iEnterMyMonthOfBirth() {
        new DateOfBirthPage().setMonth("02");
    }

    @And("^I enter my year Of Birth$")
    public void iEnterMyYearOfBirth() {
        new DateOfBirthPage().setYear("2000");
    }

    @And("^I click on next button for date of birth$")
    public void iClickOnNextButtonForDateOfBirth() {
        new DateOfBirthPage().clickOnNextButton3();
    }

    @And("^I select live with a partner$")
    public void iSelectLiveWithAPartner() {
        new PartnerPage().clickonLiveWithPartner();
    }

    @And("^I click on next button for live with a partner$")
    public void iClickOnNextButtonForLiveWithAPartner() {
        new PartnerPage().clickOnNextButton4();
        new PartnerPage().clickOnNextButton4();
    }

    @And("^I select me or my partner is not claim any benefits or tax credits$")
    public void iSelectMeOrMyPartnerIsNotClaimAnyBenefitsOrTaxCredits() {
        new TexCreditPage().clickOnClaimBebefirOrTax();
    }

    @And("^I click on next button for benefits or tax credits$")
    public void iClickOnNextButtonForBenefitsOrTaxCredits() {
        new TexCreditPage().clickOnNextButton5();
    }

    @And("^I select option no for my pregnant or have you given birth in the last (\\d+) months$")
    public void iSelectOptionNoForMyPregnantOrHaveYouGivenBirthInTheLastMonths(int arg0) {
   new BirthPage().clickOnPragnentOrGivenBirth();
    }

    @And("^I click on next button for pregnaice$")
    public void iClickOnNextButtonForPregnaice() {
        new BirthPage().clickOnNextButton6();
    }

    @And("^I select i dont have any injury or illness caused by serving in the armed forces$")
    public void iSelectIDontHaveAnyInjuryOrIllnessCausedByServingInTheArmedForces() {
        new ArmedForcesPage().clickOnInjuryOrIllness();
    }

    @And("^I click on next button for injury$")
    public void iClickOnNextButtonForInjury() {
        new ArmedForcesPage().clickOnNextButton7();
    }

    @And("^I select i dont have diabetes$")
    public void iSelectIDontHaveDiabetes() {
        new DiabetesPage().clickOnDiabities();
    }

    @And("^I click on next button for diabetes$")
    public void iClickOnNextButtonForDiabetes() {
        new DiabetesPage().clickOnNextButton8();
    }

    @And("^I select i dont have glaucoma$")
    public void iSelectIDontHaveGlaucoma() {
        new GlaucomaPage().clickOnGlucoma();
    }

    @And("^I click on next button for glaucoma$")
    public void iClickOnNextButtonForGlaucoma() {
        new GlaucomaPage().clickOnNext9();
    }



    @And("^I click on next button for savings and investments$")
    public void iClickOnNextButtonForSavingsAndInvestments() {
        new SavingsPage().clickOnNext11();
    }

    @Then("^I should get a result of whether I will get help or not$")
    public void iShouldGetAResultOfWhetherIWillGetHelpOrNot() {
        Assert.assertEquals("Not Getting help","You get help with NHS costs",new NhsCosts().VerifyResultMsg());
    }

    @And("^I select my and my partner have not more than £(\\d+),(\\d+) in savings, investments or property$")
    public void iSelectMyAndMyPartnerHaveNotMoreThan£InSavingsInvestmentsOrProperty(int arg0, int arg1) {
        new SavingsPage().clickOnSavingInvestInProperty();
    }
}
