package net.silverdust.pratik.myapplication.artifacts;

import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.base.IdlingResourceRegistry;
import android.support.test.rule.ActivityTestRule;

import net.silverdust.pratik.myapplication.MainActivity;

import org.junit.Before;
import org.junit.Rule;

/**
 * Created by pratik on 3/13/19.
 */

public class BaseUITest {
//    @Rule
//    public ActivityTestRule<NBCLogInActivity>mActivity = new ActivityTestRule<>(NBCLogInActivity.class);
@Rule
public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void startup() throws InterruptedException{
        //register the custom error handler
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
//        Espresso.setFailureHandler(new CustomFailureHandler(instrumentation));

        //Code for login
    }

    //SignOut
    public void tearDown(){
        //write code for sign out
    }

}
