package tests;

import org.testng.annotations.Test;

public class MoodPandaTest extends BaseTest {
    @Test
    public void login() {
        loginPage
                .openPage()
                .login("moodpanda@malinator.com", "32167")
                .openRateHappinessModal()
                .updateMood(9)
                .goToMyDiary();
    }
}
