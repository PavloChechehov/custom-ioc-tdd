package com.jeeconf.testing.injection;

import com.jeeconf.annotations.AutoSearch;
import com.jeeconf.annotations.JEEConfComponent;
import com.jeeconf.testing.typed.Assistant;

@JEEConfComponent
public class Organizer {
    private Assistant assistant;

    @AutoSearch
    public Organizer(Assistant assistant) {
        this.assistant = assistant;
    }

    public Assistant getAssistant() {
        return assistant;
    }
}
