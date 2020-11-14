package org.javaweb;

import org.springframework.stereotype.Component;

@Component
public class SoulMusic implements Music {
    @Override
    public String getSong() {
        return "Georgia is in my mind";
    }
}