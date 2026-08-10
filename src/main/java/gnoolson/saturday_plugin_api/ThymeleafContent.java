package gnoolson.saturday_plugin_api;

import java.util.Map;

public class ThymeleafContent extends Content {

    private final Map<String, Object> models;

    /*
     *
     *
     * */
    public ThymeleafContent(String content, Map<String, Object> models) {
        super(content);
        this.models = models;
    }

    public Map<String, Object> getModels() {
        return models;
    }

}
