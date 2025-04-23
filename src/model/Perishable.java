package model;

public class Perishable {
        private String name;
        private boolean isExpired;

        public Perishable(String name, boolean isExpired) {
            this.name = name;
            this.isExpired = isExpired;
        }

        public String getName() {
            return name;
        }

        public boolean isExpired() {
            return isExpired;
        }

        @Override
        public String toString() {
            return "Perishable: " + name + " (Expired: " + isExpired + ")";
        }
    }