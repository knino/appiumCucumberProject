package pages;

public class GmailApp extends BaseClass {
    private String welcomeButton = "com.google.android.gm:id/welcome_tour_got_it";
    private String actionDone = "com.google.android.gm:id/action_done";
    private String closeButton = "//android.widget.ImageButton[@content-desc=\"Cerrar\"]";
    private String newMessageButton = "com.google.android.gm:id/compose_button";
    private String forMailInput = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.EditText";
    //private String selectMail = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout";
    private String subjectMailInput = "com.google.android.gm:id/subject";
    private String bodyMailText = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.widget.EditText";
    //private String mail = "hrojas@losangeles.cl";
    //private String subject = "test";
    //private String body = "bodyTest";

    public GmailApp(){
        super(BaseClass._driver);
    }

public void clickOnWelcome(){
        this.clickElementById(welcomeButton);
}

    public void clickActionDone(){
        this.clickElementById(actionDone);
    }

    public void clickCloseButton(){
        this.clickElementByXpath(closeButton);
    }

    public Boolean checkForMail(){
        return  this.checkEnableXpath(forMailInput);
    }

    public Boolean checkSubjectMail(){
        return this.checkEnableId(subjectMailInput);
    }

    public Boolean checkBodyMail(){
        return this.checkEnableXpath(bodyMailText);
    }
    public void clickNewMessageButton(){
        this.clickElementById(newMessageButton);
    }

}
