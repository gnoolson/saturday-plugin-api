package gnoolson.saturday_plugin_api;

import org.luaj.vm2.LuaTable;

public abstract class LuaModule extends LuaTable {

    public abstract void updateFunctionality(Functionality functionality);

    public abstract void release();

    public abstract String name();

}
