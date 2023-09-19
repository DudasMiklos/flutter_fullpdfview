#import "FlutterFullpdfviewPlugin.h"
#import "FlutterFullPDFView.h"

@implementation FlutterFullpdfviewPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
    FLTPDFViewFactory* pdfViewFactory = [[FLTPDFViewFactory alloc] initWithMessenger:registrar.messenger];
    [registrar registerViewFactory:pdfViewFactory withId:@"plugins.DudasMiklos.io/pdfview"];
}
@end
