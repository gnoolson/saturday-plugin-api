package gnoolson.saturday_plugin_api;

import org.pf4j.Plugin;

public abstract class SaturdayPlugin extends Plugin {

    protected ScriptLauncherGateway scriptLauncherGateway;

    public void onApplicationReady() {
    }

    public void setScriptLauncherGateway(ScriptLauncherGateway scriptLauncherGateway) {
        this.scriptLauncherGateway = scriptLauncherGateway;
    }

}
