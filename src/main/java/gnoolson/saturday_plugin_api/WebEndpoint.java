package gnoolson.saturday_plugin_api;

import java.util.Map;

public interface WebEndpoint extends SaturdayExtension {

    Content getContent(String lang, String path, Map<String, String> requestParams);

    Map<String, Object> executeAction(Map<String, Object> requestBody);

}
