package com.jobits.ui.scheduler;

public interface ResourceVisitor {

    /**
     * Visitor to call on each resource requested.
     *
     * @param resource (not null) The resource being visited.
     *
     * @return {@code false} if the caller should stop visiting, {@code true} to
     * keep going.
     */
    boolean visitResource(Resource resource);
}
