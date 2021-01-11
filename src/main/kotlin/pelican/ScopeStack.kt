package pelican

class ScopeStack(val parent: ScopeStack?) {
    val variables = mutableListOf<String>()
    var stackSize = 0
}