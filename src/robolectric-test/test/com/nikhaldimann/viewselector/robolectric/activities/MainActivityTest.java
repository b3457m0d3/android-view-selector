package com.nikhaldimann.viewselector.robolectric.activities;

import org.junit.runner.RunWith;

import android.app.Activity;

import com.nikhaldimann.viewselector.robolectric.RobolectricTestMainActivity;
import com.xtremelabs.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest extends AbstractMainActivityTest {

    protected Activity createActivity() {
        RobolectricTestMainActivity activity = new RobolectricTestMainActivity();
        activity.onCreate(null);
        return activity;
    }

}
