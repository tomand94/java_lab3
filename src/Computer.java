class Computer {
    private double cpuTemperature; // temperatura
    protected int ramMemory; // ilość pamięci w MB

    public Computer(double cpuTemperature, int ramMemory) {
        this.cpuTemperature = cpuTemperature;
        this.ramMemory = ramMemory;
    }

    public double getCpuTemperature() {
        return cpuTemperature;
    }

    public void setCpuTemperature(double cpuTemperature) {
        this.cpuTemperature = cpuTemperature;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void coolDown() {
        cpuTemperature = cpuTemperature - 1;
    }

    @Override
    public String toString() {
        return "cpuTemperature=" + cpuTemperature +
                ", ramMemory=" + ramMemory +
                ", ";
    }
}