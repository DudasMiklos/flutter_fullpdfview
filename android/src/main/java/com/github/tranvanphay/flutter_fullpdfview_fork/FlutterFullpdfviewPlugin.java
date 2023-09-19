package com.github.tranvanphay.flutter_fullpdfview_fork;

import io.flutter.plugin.common.PluginRegistry.Registrar;

public class FlutterFullpdfviewPlugin {
    /** Plugin registration. */
    public static void registerWith(Registrar registrar) {
        registrar
                .platformViewRegistry()
                .registerViewFactory(
                        "plugins.tranvanphay.io/pdfview", new FULLPDFViewFactory(registrar.messenger()));
    }
}
