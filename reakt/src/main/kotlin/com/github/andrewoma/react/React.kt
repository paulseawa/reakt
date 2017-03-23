package com.github.andrewoma.react

import org.w3c.dom.Element

/**
 * React is the top-level class for interacting with the React environment externally.
 */
class React {
    fun <P:Any, S:Any>createFactory(spec: ReactComponentSpec<P, S>): ReactComponentFactory<P, S>
            = Reakt.createClass(spec)

    fun <C : ReactComponent<*, *>> render(component: C, container: Element, callback: () -> Unit = {}): C
            = ReactDOM.render(component, container, callback)

    fun <P> createElement(reactComponent: ReactComponent<P, *>, prop: P, vararg children: Any?): Any {
        return Reakt.createElement(reactComponent, prop, children)
    }
}

val react: React = React()

// Can't seem to nest these inside a class
@JsName("Reakt")
external object Reakt {
    fun <T> getProperty(thisRef: Any, name: String): T

    fun <T> setProperty(thisRef: Any, name: String, value: T): Unit

    fun <T> getProperties(thisRef: Any): T

    internal fun <P:Any, S:Any>createClass(spec: ReactComponentSpec<P, S>): ReactComponentFactory<P, S>

    internal fun <T>  flattenProperties(properties: T): T

    internal fun <P> createElement(reactComponent: ReactComponent<*, *>, prop: P, vararg children: Any?): ReactComponent<Any, Any>

    fun uniqueId(obj: Any): String
}
@JsName("ReactDOM")
external object ReactDOM {
    internal fun <C : ReactComponent<*, *>> render(component: C, container: Element, callback: () -> Unit = definedExternally): C

    internal fun unmountComponentAtNode(container: Element): Unit

}