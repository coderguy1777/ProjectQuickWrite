public class NeuronClass {
    private int neuron;
    private int neuronweight;
    private int neuronbranch;

    public NeuronClass(int neuron, int neuronweight, int neuronbranch) {
        setNeuron(neuronweight);
        setNeuronweight(neuron);
        setNeuronbranch(neuronweight/2);
    }
    public NeuronClass() {

    }
    public NeuronClass(int neuronweight, int neuronbranch) {
        this(neuronweight);
        setNeuron(neuronweight);
    }

    public NeuronClass(int neuronweight) {

    }

    public void setNeuron(int neuron) {
        this.neuron = neuron;
    }

    public void setNeuronweight(int neuronweight) {
        this.neuronweight = neuronweight;
    }

    public void setNeuronbranch(int neuronbranch) {
        this.neuronbranch = neuronbranch;
    }

    public int getNeuron() {
        return neuron;
    }

    public int getNeuronweight() {
        return neuronweight;
    }

    public int getNeuronbranch() {
        return neuronbranch;
    }

}