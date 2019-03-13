package net.silverdust.pratik.myapplication.functionalTest;

import net.silverdust.pratik.myapplication.R;
import net.silverdust.pratik.myapplication.artifacts.BaseUITest;
import net.silverdust.pratik.myapplication.artifacts.GetDataFromUrl;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by pratik on 3/13/19.
 */

public class VerifyVideoHeartBeat extends BaseUITest {

    public static void playAsset() {
    // Click on the icon - we can find it by the r.Id.
   //     onView(withId(R.id.))
   //             .perform(click());

        // Click the item.
        onView(withText("On-Domain"))
                .perform(click());

        //play asset
        onView(withText("The Tonight Show Starring Jimmy Fallon"))
                .perform(click());
    }

    @Test
    public void verifyVideoHeartBeat(){
        //play OnDemand asset
        playAsset();

        //Get data from URL
        GetDataFromUrl eventTypeactual = new GetDataFromUrl();
        eventTypeactual.getDataFromUrl("https://nbcume.hb.omtrdc.net/?s:sc:rsid=nbcutvemobileapp%2Cnbcuiphoneappsnbcnetworkbu%2Cnbcunetworkbu&s:sc:tracking_server=nbcume.sc.omtrdc.net&h:sc:ssl=0&&&&s:sp:ovp=ovp&s:sp:channel=On-Domain&s:sp:sdk=1.6.4&s:sp:player_name=Anvato+Android+Player&s:sp:hb_version=android-n-1.6.9.99-66a549&l:sp:hb_api_lvl=4&s:event:sid=1548739098742312272337&l:event:duration=6&l:event:playhead=19098&l:event:prev_ts=-1&s:event:type=start&l:event:ts=1548739098771&s:asset:name=The+Tonight+Show+Starring+Jimmy+Fallon&l:asset:length=-1&s:asset:publisher=A8AB776A5245B4220A490D44%40AdobeOrg&s:asset:type=main&s:asset:video_id=e3095576&s:stream:type=Linear&l:stream:startup_time=16000&l:stream:fps=30&l:stream:bitrate=200000&l:stream:dropped_frames=0&s:meta:a.nielsen.clientid=us-800148&s:meta:videoepnumber=74&s:meta:videotitle=The+Tonight+Show+Starring+Jimmy+Fallon&s:meta:videostatus=Restricted&s:meta:videoinitiate=Manual&s:meta:a.nielsen.appid=P1C377781-0BA4-4D6E-8111-0267BE0D2DC0&s:meta:a.nielsen.accmethod=1&s:meta:videodate=01%2F28%2F2019&s:meta:videoplatform=Mobile&s:meta:videocallsign=WNBC&s:meta:a.nielsen.program=The+Tonight+Show+Starring+Jimmy+Fallon&s:meta:a.nielsen.ctype=VIDEO&s:meta:videodaypart=N%2FA&s:meta:videoday=Monday&s:meta:videohour=21&s:meta:videominute=21%3A18&s:meta:videomvpd=Cablevision&s:meta:videoapp=Local+O+%26+O&s:meta:videosubcat2=N%2FA&s:meta:videosubcat1=Other&s:meta:a.nielsen.vcid=c37&s:meta:videonetwork=NBC&s:meta:a.nielsen.segc=segC&s:meta:videoplayertech=Mobile+Operating+System&s:meta:a.nielsen.segb=segB&s:meta:videoscreen=Full&s:meta:a.nielsen.sega=The+Tonight+Show+Starring+Jimmy+Fallon&s:meta:videoseason=6&s:meta:videoprogram=The+Tonight+Show+Starring+Jimmy+Fallon&s:meta:a.nielsen.admodel=1&s:meta:videoairdate=01%2F28%2F2019&s:meta:videoguid=e3095576",
                "s:event:type");
        String eventTypeexpected = "start";
        assertThat(eventTypeexpected, (Matcher<String>) eventTypeactual);
    }

    @After
    @Override
    public void tearDown() {
        super.tearDown();
    }
}
