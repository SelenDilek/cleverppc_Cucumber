package StepDefinitons;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before // Cucumber ın Annotation ı
    public void before()
    {
        // System.out.println("Senaryo başladı ?");
    }

    @After // Cucumber ın Annotation ı
    public void after(Scenario senaryo)
    {

        if (senaryo.isFailed()){
            TakesScreenshot ts=((TakesScreenshot) GWD.getDriver());
            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }

        //System.out.println("Senaryo bitti ?");
        // doğru çalışırsa burada quiti çağıracağım
        GWD.quitDriver();
    }
}
