package com.github.andrewoma.react

import kotlin.reflect.KProperty

public interface ReadWriteProperty<in R, T> {
    public operator fun getValue(thisRef: R, property: KProperty<*>): T
    public operator fun setValue(thisRef: R, property: KProperty<*>, value: T)
}

/**
 * Property is a delegated property that stores properties in a plain JavaScript object.
 * React doesn't find properties declared via a prototype, so this works around that limitation.
 */
public class Property<in R, T> : ReadWriteProperty<R, T> {
    override fun getValue(thisRef: R, property: KProperty<*>): T {
        return Reakt.getProperty(thisRef as Any, property.name)
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: T) {
        Reakt.setProperty(thisRef as Any, property.name, value)
    }
}

public open class PrefixProperty<in R, T>(val prefix: String) : ReadWriteProperty<R, T> {
    override fun getValue(thisRef: R, property: KProperty<*>): T {
        return Reakt.getProperty(thisRef as Any, prefix + property.name)
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: T) {
        Reakt.setProperty(thisRef as Any, prefix + property.name, value)
    }
}

public class DataProperty<in R, T> : PrefixProperty<R, T>("data-")
public class AreaProperty<in R, T> : PrefixProperty<R, T>("area-")

