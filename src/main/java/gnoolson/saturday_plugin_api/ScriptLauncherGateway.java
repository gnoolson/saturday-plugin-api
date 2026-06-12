package gnoolson.saturday_plugin_api;

import java.util.Map;

public interface ScriptLauncherGateway {

    void execute(String projectId, String scriptId, Map<String, Object> args);

}
