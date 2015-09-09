package models;

import play.PlayPlugin;
import play.libs.F;

public class FilterTwo extends PlayPlugin {

    @Override
    public Filter getFilter() {
        return new Filter("Two") {
            @Override
            public Object withinFilter(F.Function0 fct) throws Throwable {
                return fct.apply();
            }
        };
    }

}
