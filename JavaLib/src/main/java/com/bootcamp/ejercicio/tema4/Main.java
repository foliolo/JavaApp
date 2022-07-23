package com.bootcamp.ejercicio.tema4;

/**
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
public class Main {

    public static void main(String[] args) {

        SmartDevice emptyPhone = new SmartPhone();
        SmartDevice smartPhone = new SmartPhone(250, 32, 256);
        SmartDevice smartWatch = new SmartWatch(150.0, 1200);

        System.out.println(emptyPhone);
        System.out.println(smartPhone);
        System.out.println(smartWatch);
    }
}

class SmartDevice {
    Double price;

    public SmartDevice() {
        this.price = 100.0;
    }

    public SmartDevice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Smart Device: \n" +
                "\tPrice: " + price + "\n";
    }
}

class SmartPhone extends SmartDevice {
    int ram;
    int memory;

    public SmartPhone() {
        this.ram = 16;
        this.memory = 128;
    }

    public SmartPhone(double price, int ram, int memory) {
        super(price);
        this.ram = ram;
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Smart Phone: \n" +
                "\tPrice: " + price + "\n" +
                "\tRam: " + ram + "\n" +
                "\tMemory: " + memory + "\n";
    }
}

class SmartWatch extends SmartDevice {
    int battery;

    public SmartWatch() {
        this.battery = 100;
    }

    public SmartWatch(double price, int battery) {
        super(price);
        this.price = price;
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Smart Watch: \n" +
                "\tPrice: " + price + "\n" +
                "\tBattery: " + battery + "\n";
    }
}