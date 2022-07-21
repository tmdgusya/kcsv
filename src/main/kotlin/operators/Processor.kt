package operators

interface Processor<I, O> {
    fun process(data: I): O
}
