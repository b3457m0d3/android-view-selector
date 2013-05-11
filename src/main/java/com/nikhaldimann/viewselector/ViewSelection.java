package com.nikhaldimann.viewselector;

import java.util.ArrayList;

import android.view.View;

/**
 * List representing a selection of views made via a selector. We're making
 * this its own type in order to be able to single it out in FEST-style
 * assertThat() calls.
 */
public class ViewSelection extends ArrayList<View> {

}