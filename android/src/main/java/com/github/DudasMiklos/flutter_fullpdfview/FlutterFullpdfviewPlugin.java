package android.src.main.java.com.github.DudasMiklos.flutter_fullpdfview;

import io.flutter.plugin.common.PluginRegistry.Registrar;

public class FlutterFullpdfviewPlugin {
    /** Plugin registration. */
    public static void registerWith(Registrar registrar) {
        registrar
                .platformViewRegistry()
                .registerViewFactory(
                        "plugins.DudasMiklos.io/pdfview", new FULLPDFViewFactory(registrar.messenger()));
    }
}
