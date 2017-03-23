package todo.components

import com.github.andrewoma.react.*
import todo.actions.TodoActions
import todo.stores.Todo
import todo.stores.areAllCompleted

data class MainSectionProperties(val todos: Collection<Todo>)

class MainSection : ComponentSpec<MainSectionProperties, Unit>() {
    companion object {
        val factory = react.createFactory(MainSection())
    }

    override fun Component.render() {
        log.debug("MainSection.render", props)

        if (props.todos.isEmpty()) return

        section({ id = "main" }) {
            input({
                id = "toggle-all"
                `type` = "checkbox"
                onChange = { onToggleCompleteAll() }
                checked = if ( props.todos.areAllCompleted() ) "checked" else ""
            })

            label({ htmlFor = "toggle-all" }) { text("Mark all as complete") }

            ul({ id = "todo-list" }) {
                for (todo in props.todos) {
                    todoItem(TodoItemProperties(key = todo.id, todo = todo))
                }
            }
        }
    }

    fun onToggleCompleteAll() {
        TodoActions.toggleCompleteAll(null)
    }
}

fun Component.todoMainSection(props: MainSectionProperties): Component {
    return constructAndInsert(Component({ MainSection.factory(Ref(props)) }))
}