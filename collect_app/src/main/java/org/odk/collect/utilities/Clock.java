package org.odk.collect.utilities;

/**
 * An object that exposes the current time to it's client. Useful for decoupling
 * objects from static methods such as {@link System#currentTimeMillis()}.
 */
public interface Clock {

    long getCurrentTime();
}
