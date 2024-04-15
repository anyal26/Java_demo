package Homework;
    // Расширение класса Vehicle для грузовиков,
    class Truck extends Vehicle {
        private int cargocap; // грузоподъемность в фунтах

        // Конструктор класса Truck.
        Truck(int p, int f, int m, int c) {
        /* Инициализация переменных из класса Vehicle
           с помощью вызываемого конструктора этого класса. */
            super(p, f, m);
            cargocap = c;
        }

        // Методы доступа к переменной cargocap.
        int getCargo() {
            return cargocap;
        }

        void putCargo(int c) {
            cargocap = c;
        }
    }
