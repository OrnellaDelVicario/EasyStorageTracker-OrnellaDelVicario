package model;

public class Snack extends Perishable{
        private String name;
        private String flavor;

        public Snack(String name, String flavor, boolean expired) {
            super(expired);
            this.name = name;
            this.flavor = flavor;
        }

//        public String getName() {
//            return name;
//        }
//
//        public String getFlavor() {
//            return flavor;
//        }

        @Override
        public String toString() {
            return "Snack: " + name + " (" + flavor + ")";
        }
    }
