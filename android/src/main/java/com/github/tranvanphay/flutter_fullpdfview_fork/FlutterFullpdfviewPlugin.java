package com.github.dudasmiklos.flutter_fullpdfview;

import io.flutter.plugin.common.PluginRegistry.Registrar;

public class FlutterFullpdfviewPlugin {
    /** Plugin registration. */
    public static void registerWith(Registrar registrar) {
        registrar
                .platformViewRegistry()
                .registerViewFactory(
                        "plugins.dudasmiklos.io/pdfview", new FULLPDFViewFactory(registrar.messenger()));
    }
}
