package jp.ac.aiit.pbl;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WarningState {
    public enum Definition {
        発表("1"),
        解除("2");

        private final String id;

        Definition(final String id) {
            this.id = id;
        }

        public String getInt() {
            return this.id;
        }
    }

    public final Map<String, String> definition;

    public WarningState() {
        Map<String, String> definition = new HashMap<String, String>();
        Arrays.stream(Definition.values()).forEach(value -> definition.put(Definition.valueOf(value.toString()).getInt(), value.toString()));
        this.definition = Collections.unmodifiableMap(definition);
    }
}
