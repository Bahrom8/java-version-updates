package com.cydeo.Task;

public class Trader {
        private String name;
        private String city;
        public Trader(String name, String city) {
                this.name = name;
                this.city = city;
        }
        public String getName() {
return name;
}

        public String getCity() {
return city;
}

    @Override
        public String toString() {
        return      "\nTrader name: " + name +
                    "\ncity: " + city;
        }
}