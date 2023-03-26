package ru.nsu.kbagryantsev.order;

import java.util.Collection;

public record CompletedOrder(Collection<MenuItem> content) {
    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
    }
}
