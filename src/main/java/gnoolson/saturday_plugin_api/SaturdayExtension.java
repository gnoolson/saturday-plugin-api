package gnoolson.saturday_plugin_api;

import org.pf4j.ExtensionPoint;

public interface SaturdayExtension extends ExtensionPoint {

    void setup(SaturdayPlugin saturdayPlugin);

}
