data class Note(val name: String, val content: String) {
    override fun toString(): String {
        return this.name
    }
}