package configure

import executors.ProcessorExecutor
import operators.Processor
import repository.Reader
import writer.Writer

abstract class Config<T, O>(
    private val reader: Reader<T>,
    private val writer: Writer,
    private val processorExecutor: ProcessorExecutor<T, O>
) {

    /**
     * Add Writer in Configuration Class
     */
    abstract fun writer(writer: Writer)


    /**
     * Add Reader in Configuration Class
     */
    abstract fun reader(reader: Reader<T>)


    /**
     * Add ProcessorExecutor in Configuration Class
     */
    abstract fun processorExecutor(processorExecutor: ProcessorExecutor<T, O>)


    /**
     * Add Processor in Configuration Class
     */
    abstract fun addProcessor(processor: Processor<T, O>)


    /**
     * Add Processors in Configuration Class
     */
    abstract fun addProcessors(processors: List<Processor<T, O>>)
}
