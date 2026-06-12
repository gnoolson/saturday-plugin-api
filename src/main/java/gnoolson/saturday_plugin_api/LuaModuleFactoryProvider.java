package gnoolson.saturday_plugin_api;

public interface LuaModuleFactoryProvider extends SaturdayExtension {

    LuaModuleFactory getFactory();

}
