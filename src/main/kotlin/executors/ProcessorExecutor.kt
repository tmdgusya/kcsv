package executors

import operators.Processor

abstract class ProcessorExecutor<I, O>(
    private val processors: List<Processor<I, O>>
) {

    /**
     * Add Processor List this class
     */
    abstract fun processors(processors: List<Processor<I, O>>)

    /**
     * add Single Processor this class
     */
    abstract fun processor(processor: Processor<I, O>)

    /**
     * execute operator of processor
     */
    abstract fun executeProcessor(): O

}
