package model;

public class Device {
        private String name;
        private String brand;

        public Device(String name, String brand) {
            this.name = name;
            this.brand = brand;
        }

        public String getName() {
            return name;
        }

        public String getBrand() {
            return brand;
        }

        @Override
        public String toString() {
            return "Device: " + name + " (" + brand + ")";
        }
    }

