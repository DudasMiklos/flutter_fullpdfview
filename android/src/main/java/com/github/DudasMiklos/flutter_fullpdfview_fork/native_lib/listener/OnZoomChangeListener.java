package com.github.DudasMiklos.flutter_fullpdfview.native_lib.listener;

public interface OnZoomChangeListener {
 /**
 * Called when the user use zoom action in page
 *
 * @param zoom      the new zoom
 */
    void onZoomChanged(double zoom);
}
