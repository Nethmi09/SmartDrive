package SignUp;

public class Tc_SignUpAsAStudentWithValidCredentials extends SignUpSteps{
    public static void main(String[] args) {
       openAll();
       clickSignUpButton();
       clickStudentCreateAccountButton();
       selectTitleDropdown();
    }
}
